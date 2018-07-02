
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pv/Documents/bolaoCopa/conf/routes
// @DATE:Mon Jul 02 17:55:38 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthentication Authentication = new controllers.ReverseAuthentication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignUp SignUp = new controllers.ReverseSignUp(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBetController BetController = new controllers.ReverseBetController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRestricted Restricted = new controllers.ReverseRestricted(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthentication Authentication = new controllers.javascript.ReverseAuthentication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignUp SignUp = new controllers.javascript.ReverseSignUp(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBetController BetController = new controllers.javascript.ReverseBetController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRestricted Restricted = new controllers.javascript.ReverseRestricted(RoutesPrefix.byNamePrefix());
  }

}
