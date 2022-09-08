package controllers

object EmailForm {
  import play.api.data.Forms._
  import play.api.data.Form

  case class Data(text: String, limit: Int)

  val form = Form(
    mapping(
      "Text" -> nonEmptyText,
      "Limit" -> number(min = 1)
    )(Data.apply)(Data.unapply)
  )
}

