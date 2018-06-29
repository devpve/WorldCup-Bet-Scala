package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import models.{User, Game, Bet}

class SignUp extends Controller with Secured {

	/**
	 * Signup form.
	 */
	val signUpForm = Form (
		tuple (
			"name" -> text,
			"email" -> text,
			"password" -> text
		) verifying ("Success", result => result match {
        	case (name, email, password) => {
        		User.create(new User(0, name, email, password)).isDefined
       		}
       	})
	)


	/**
	 * SignUp page
	 */
	 def signUp = Action { implicit request =>

		request.session.get("email").map {
			user => {
				var userModel = User.findByEmail(user)
				Ok(html.bet.restricted(userModel, Game.findAll, Bet.getMyBets(userModel.id)))
			}
		}.getOrElse {
	 		Ok(html.user.signup(signUpForm))
	 	}
	 }

	/**
	* Handle signup form submission.
	*/
	def trySignUp = Action { implicit request =>
		signUpForm.bindFromRequest.fold(
		  formWithErrors => BadRequest(html.user.signup(formWithErrors)),
		  user => Redirect(routes.Restricted.index()).withSession("email" -> user._2)
		)
	}

}