package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import models.{User, Game, Bet}

class Restricted extends Controller with Secured {

  /**
   * Display restricted area only if user is logged in.
   */
  def index = Action { implicit request =>
	request.session.get("email").map {
		user => {
			var userModel = User.findByEmail(user)
			Ok(html.bet.mainpage(userModel, Game.findAll, Bet.getMyBets(userModel.id)))
		}
	}.getOrElse {
 		Ok(html.index())
 	}
  }
    
}