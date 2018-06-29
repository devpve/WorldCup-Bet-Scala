package controllers

import play.api.mvc.Controller
import models.{User, Game, Bet}
import views._

class Restricted extends Controller with Secured {

  /**
   * Display restricted area only if user is logged in.
   */
  def index = IsAuthenticated { 
  	username =>
  	_ =>
      var user = User.findByEmail(username) 
      Ok(html.bet.restricted(user, Game.findAll, Bet.getMyBets(user.id)))
  }
    
}