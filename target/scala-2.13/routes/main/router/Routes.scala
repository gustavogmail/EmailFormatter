// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  EmailFormatterController_0: controllers.EmailFormatterController,
  // @LINE:10
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    EmailFormatterController_0: controllers.EmailFormatterController,
    // @LINE:10
    Assets_1: controllers.Assets
  ) = this(errorHandler, EmailFormatterController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, EmailFormatterController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.EmailFormatterController.emptyForm"""),
    ("""POST""", this.prefix, """controllers.EmailFormatterController.formatTheEmail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """formattedMessage""", """controllers.EmailFormatterController.formattedMessage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_EmailFormatterController_emptyForm0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_EmailFormatterController_emptyForm0_invoker = createInvoker(
    EmailFormatterController_0.emptyForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmailFormatterController",
      "emptyForm",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_EmailFormatterController_formatTheEmail1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_EmailFormatterController_formatTheEmail1_invoker = createInvoker(
    EmailFormatterController_0.formatTheEmail,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmailFormatterController",
      "formatTheEmail",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_EmailFormatterController_formattedMessage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("formattedMessage")))
  )
  private[this] lazy val controllers_EmailFormatterController_formattedMessage2_invoker = createInvoker(
    EmailFormatterController_0.formattedMessage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmailFormatterController",
      "formattedMessage",
      Nil,
      "GET",
      this.prefix + """formattedMessage""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_EmailFormatterController_emptyForm0_route(params@_) =>
      call { 
        controllers_EmailFormatterController_emptyForm0_invoker.call(EmailFormatterController_0.emptyForm)
      }
  
    // @LINE:6
    case controllers_EmailFormatterController_formatTheEmail1_route(params@_) =>
      call { 
        controllers_EmailFormatterController_formatTheEmail1_invoker.call(EmailFormatterController_0.formatTheEmail)
      }
  
    // @LINE:7
    case controllers_EmailFormatterController_formattedMessage2_route(params@_) =>
      call { 
        controllers_EmailFormatterController_formattedMessage2_invoker.call(EmailFormatterController_0.formattedMessage)
      }
  
    // @LINE:10
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
