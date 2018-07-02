package models

import play.api.db._
import play.api.Play.current
import java.sql.Timestamp
import anorm._
import java.time.LocalDate
import anorm.SqlParser._
import java.time.LocalDate
import models.{User, Game}

case class Bet(userID: Int, gameID: Int, bet: String)

object Bet {

  /**
   * Parse a Bet from a ResultSet
   */
  val simple = {
    get[Int]("bet.userID") ~
    get[Int]("bet.gameID") ~
    get[String]("bet.bet") map {
      case userID ~ gameID ~ bet => Bet(userID, gameID, bet)
    }
  }

  val parser : RowParser[models.Bet] = Macro.namedParser[models.Bet]

  /**
   * Create a new bet.
   */
  def create(bet: Bet): Option[Bet] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into users_games (userID, gameID, bet, winner) values (
            {userID}, {gameID}, {bet}, 0
          )
        """).on(
          'userID -> bet.userID,
          'gameID -> bet.gameID,
          'bet -> bet.bet).executeUpdate()

      Some(bet)
    }
  }

  /**
   * Edit a bet.
   */
  def put(bet: Bet): Option[Bet] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update users_games set bet = {bet} where userID = {userID} and gameID = {gameID}

        """
      ).on(
        'userID -> bet.userID,
        'gameID -> bet.gameID,
        'bet -> bet.bet).executeUpdate()

      Some(bet)
    }
  }

  /**
   *  Delete a bet
   */
  def delete(bet: Bet): Int = { 
    DB.withConnection { implicit connection =>
      SQL(
        """
          delete from users_games where userID = {userID} and gameID = {gameID}

        """
      ).on(
        'userID -> bet.userID,
        'gameID -> bet.gameID).executeUpdate()
    }
  }

  /**
   *  Retrieve bet from a specific user.
   */
  def getMyBets(userID: Int) : List[Bet] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          select * from users_games where userID = {userID}

        """
      ).on(
        'userID -> userID).as(parser.*)
    }
  }

  /**
   *  Retrieve bet from a specific user.
   */
  def getSpecificBet(userID: Int, gameID: Int) : Bet = {
    try { 
      DB.withConnection { implicit connection =>
      SQL(
        """
          select * from users_games where userID = {userID} and gameID = {gameID}

        """
      ).on(
        'userID -> userID,
        'gameID -> gameID).as(parser.*).head
      }
    }
    catch {
      case _ => return Bet(0, 0, "") 
    }
  }

  /**
   *  Retrieve bets from a specific game.
   */
  def getBetsFromGames(gameID: Int) : List[Bet] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          select * from users_games where gameID = {gameID}

        """).as(parser.*)
    }
  }

}
