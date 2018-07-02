package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import javax.inject.Inject
import models.{User, Game, Bet}

class Authentication extends Controller  {

  /**
   *  Login form. 
   *  If it receives an email and a password it's gonna try to authenticate the user.
   */
  val loginForm = Form(
    tuple(
      "email" -> text,
      "password" -> text
    ) verifying ("Email ou senha incorretos.", result => result match {
        case (email, password) => User.authenticate(email, password).isDefined
    })
  )

  /**
   * Login page.
   */
  def login = Action { implicit request =>
    request.session.get("email").map {
      user => {
        var userModel = User.findByEmail(user)
        Ok(html.bet.mainpage(userModel, Game.findAll, Bet.getMyBets(userModel.id)))
      }
    }.getOrElse {
      Ok(html.user.login(loginForm))
    }
  }

  /**
   * Logout and clean the session.
   */
  def logout = Action {
    Redirect(routes.Authentication.login).withNewSession.flashing(
      "success" -> "Você saiu do sistema."
    )
  }

  /**
   * Handle login form submission.
   */
  def authenticate = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.user.login(formWithErrors)),
      user => Redirect(routes.Restricted.index()).withSession("email" -> user._1)
    )
  }

}