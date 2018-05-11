// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agile-monkey-g3/Dev/expert-monkey/conf/routes
// @DATE:Fri May 11 09:34:09 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseViewsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewsController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def allCharacteristics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.allCharacteristics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/characteristics"})
        }
      """
    )
  
    // @LINE:12
    def questionOrGuess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.questionOrGuess",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/ask"})
        }
      """
    )
  
    // @LINE:14
    def addObject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.addObject",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/objects"})
        }
      """
    )
  
    // @LINE:13
    def allObjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.allObjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/objects"})
        }
      """
    )
  
  }


}
