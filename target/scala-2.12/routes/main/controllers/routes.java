// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agile-monkey-g3/Dev/play-framework/expert-system/conf/routes
// @DATE:Wed May 02 20:38:22 COT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseViewsController ViewsController = new controllers.ReverseViewsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiController ApiController = new controllers.ReverseApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseViewsController ViewsController = new controllers.javascript.ReverseViewsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiController ApiController = new controllers.javascript.ReverseApiController(RoutesPrefix.byNamePrefix());
  }

}
