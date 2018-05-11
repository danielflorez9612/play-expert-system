// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agile-monkey-g3/Dev/expert-monkey/conf/routes
// @DATE:Fri May 11 09:34:09 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ViewsController_2: controllers.ViewsController,
  // @LINE:10
  Assets_1: controllers.Assets,
  // @LINE:12
  ApiController_0: controllers.ApiController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ViewsController_2: controllers.ViewsController,
    // @LINE:10
    Assets_1: controllers.Assets,
    // @LINE:12
    ApiController_0: controllers.ApiController
  ) = this(errorHandler, ViewsController_2, Assets_1, ApiController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ViewsController_2, Assets_1, ApiController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ViewsController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.ViewsController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/ask""", """controllers.ApiController.questionOrGuess"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/objects""", """controllers.ApiController.allObjects"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/objects""", """controllers.ApiController.addObject()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/characteristics""", """controllers.ApiController.allCharacteristics"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ViewsController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ViewsController_index0_invoker = createInvoker(
    ViewsController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewsController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ViewsController_create1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_ViewsController_create1_invoker = createInvoker(
    ViewsController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewsController",
      "create",
      Nil,
      "GET",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_ApiController_questionOrGuess3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/ask")))
  )
  private[this] lazy val controllers_ApiController_questionOrGuess3_invoker = createInvoker(
    ApiController_0.questionOrGuess,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "questionOrGuess",
      Nil,
      "POST",
      this.prefix + """api/ask""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ApiController_allObjects4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/objects")))
  )
  private[this] lazy val controllers_ApiController_allObjects4_invoker = createInvoker(
    ApiController_0.allObjects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "allObjects",
      Nil,
      "GET",
      this.prefix + """api/objects""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ApiController_addObject5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/objects")))
  )
  private[this] lazy val controllers_ApiController_addObject5_invoker = createInvoker(
    ApiController_0.addObject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "addObject",
      Nil,
      "POST",
      this.prefix + """api/objects""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ApiController_allCharacteristics6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/characteristics")))
  )
  private[this] lazy val controllers_ApiController_allCharacteristics6_invoker = createInvoker(
    ApiController_0.allCharacteristics,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "allCharacteristics",
      Nil,
      "GET",
      this.prefix + """api/characteristics""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ViewsController_index0_route(params@_) =>
      call { 
        controllers_ViewsController_index0_invoker.call(ViewsController_2.index)
      }
  
    // @LINE:7
    case controllers_ViewsController_create1_route(params@_) =>
      call { 
        controllers_ViewsController_create1_invoker.call(ViewsController_2.create)
      }
  
    // @LINE:10
    case controllers_Assets_versioned2_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_ApiController_questionOrGuess3_route(params@_) =>
      call { 
        controllers_ApiController_questionOrGuess3_invoker.call(ApiController_0.questionOrGuess)
      }
  
    // @LINE:13
    case controllers_ApiController_allObjects4_route(params@_) =>
      call { 
        controllers_ApiController_allObjects4_invoker.call(ApiController_0.allObjects)
      }
  
    // @LINE:14
    case controllers_ApiController_addObject5_route(params@_) =>
      call { 
        controllers_ApiController_addObject5_invoker.call(ApiController_0.addObject())
      }
  
    // @LINE:15
    case controllers_ApiController_allCharacteristics6_route(params@_) =>
      call { 
        controllers_ApiController_allCharacteristics6_invoker.call(ApiController_0.allCharacteristics)
      }
  }
}
