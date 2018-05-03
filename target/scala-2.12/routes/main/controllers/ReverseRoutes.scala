// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agile-monkey-g3/Dev/play-framework/expert-system/conf/routes
// @DATE:Wed May 02 20:38:22 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseViewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def allCharacteristics(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/characteristics")
    }
  
    // @LINE:12
    def questionOrGuess(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/ask")
    }
  
    // @LINE:14
    def addObject(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/objects")
    }
  
    // @LINE:13
    def allObjects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/objects")
    }
  
  }


}
