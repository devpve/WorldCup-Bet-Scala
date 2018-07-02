package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import models.{User, Game, Bet}

class BetController extends Controller with Secured {


	/**
	* 	Handle new bet page.
	*/
	def newBet (teams: String) = IsAuthenticated { username => implicit request =>
		var game = Game.findByTeams(teams)
       	Ok(html.bet.newbet(username, game, betForm))
	}

	/**
	 *	Handle edit bet page.
	 */
	def editBet (teams: String) = IsAuthenticated { username => implicit request =>
		var game = Game.findByTeams(teams)
       	Ok(html.bet.editbet(username, game, betForm))
	}

	/**
	 * 	Handle delete bet page.
	 */
	def deleteBet (teams: String) = IsAuthenticated { username => implicit request =>
		var game = Game.findByTeams(teams)
		var user = User.findByEmail(username)
		var bet = Bet.getSpecificBet(user.id, game.id)
       	Ok(html.bet.deletebet(username, game, bet))
	}


	/**
	 * Submit a new bet.
	 */
	def tryNewBet(teams: String) = IsAuthenticated { username => implicit request =>
		var user = User.findByEmail(username)
		var game = Game.findByTeams(teams)

		betForm.bindFromRequest.fold(
		  formWithErrors => {
		  	BadRequest(html.bet.newbet(username, game, formWithErrors))
		  },
		  bet => {
		  	Bet.create(new Bet(user.id, game.id, bet.bet))
		  	Redirect(routes.Restricted.index())
		  }
		)		
	}


	/**
	 *	Try editing a bet.
	 */
	def tryEditBet(teams: String) = IsAuthenticated { username => implicit request =>
		var user = User.findByEmail(username)
		var game = Game.findByTeams(teams)

		betForm.bindFromRequest.fold(
		  formWithErrors => {
		  	BadRequest(html.bet.editbet(username, game, formWithErrors))
		  },
		  bet => {
			var user = User.findByEmail(username)
			var game = Game.findByTeams(teams)
		  	Bet.put(new Bet(user.id, game.id, bet.bet))
		  	Redirect(routes.Restricted.index())
		  }
		)		
	}

	/** 
	 *	Try deleting a bet.
	 */
	def tryDeleteBet(teams: String) = IsAuthenticated { username => implicit request =>
		var gameID = Game.findByTeams(teams).id
		var userID = User.findByEmail(username).id
		Bet.delete(new Bet(userID, gameID, ""))
		Redirect(routes.Restricted.index())
	}

	/**
	 * Bet form
	 */
	val betForm = Form (
		mapping (
			"bet" -> nonEmptyText
		) (betVO.apply)(betVO.unapply)
	)

}

case class betVO(bet: String)