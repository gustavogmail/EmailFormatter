package controllers

import javax.inject.Inject

import models.EmailPattern
import play.api.data._
import play.api.i18n._
import play.api.mvc._

import scala.collection._

class EmailFormatterController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  import EmailForm._

  private val postUrl = routes.EmailFormatterController.formatTheEmail
  private var testMessage = "something went wrong with your request"
  private var originalText = ""

  def emptyForm = Action { implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.emailForm(form, postUrl))
  }

  def formattedMessage = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.formattedEmail(testMessage, originalText))
  }

  def formatTheEmail = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { formWithErrors: Form[Data] =>
      BadRequest(views.html.emailForm(formWithErrors, postUrl))
    }

    val successFunction = { data: Data =>
      originalText = data.text
      testMessage = textFormatter(originalText, data.limit)
      Redirect(routes.EmailFormatterController.formattedMessage).flashing("info" -> "Success!")
    }

    val formValidationResult = form.bindFromRequest()
    formValidationResult.fold(errorFunction, successFunction)
  }

  def textFormatter(text: String, limit: Int): String = {
    val words = text.split("\\s+")
    val paragraph = new StringBuilder
    val row = new StringBuilder
    var currentWord = ""

    def lineLimitExceeded(): Boolean = {
      return row.length() + currentWord.length() + 1 > limit
    }

    def appendLineBreakInParagraph(): Unit = {
      if (paragraph.nonEmpty) {
        paragraph.append("\n")
      }
    }

    def goThroughWordByWord(): Unit = {
      for (w <- words) {
        currentWord = w

        if (lineLimitExceeded()) {
          appendLineBreakInParagraph()
          paragraph.append(row.toString)
          row.setLength(0)
        }

        if (row.nonEmpty) {
          row.append(' ')
        }
        row.append(w)
      }
    }

    goThroughWordByWord()

    if (row.nonEmpty) {
      appendLineBreakInParagraph()
      paragraph.append(row)
    }

    return paragraph.toString
  }
}
