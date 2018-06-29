package models

import play.api.db._
import play.api.Play.current
import java.sql.Timestamp
import anorm._
import java.time.LocalDate
import anorm.SqlParser._

case class Game(id: Int, teams: String, datetime: LocalDate, place: String)

object Game {

  /**
   * Parse a Game from a ResultSet
   */
  val simple = {
    get[Int]("game.id") ~
    get[String]("game.teams") ~
    get[LocalDate]("game.datetime") ~
    get[String]("game.place") map {
      case id ~ teams ~ datetime ~ place => Game(id, teams, datetime, place)
    }
  }

  val parser : RowParser[models.Game] = Macro.namedParser[models.Game]

  /**
   * Retrieve a Game from teams.
   */
  def findByTeams(teams: String): Game = {
    DB.withConnection { implicit connection =>
      SQL("select * from game where teams = {teams}").on(
        'teams -> teams).as(Game.simple.single)
    }
  }

  /**
   * Retrieve a game id.
   */
  def findID(game: Game) : Option[Game] = {
    DB.withConnection { implicit connection =>
      SQL("""
          select ID from game where teams = {teams} 
                                    and datetime = {datetime} 
                                    and place = {place}
          """).on(
            'teams -> game.teams,
            'datetime -> game.datetime.atStartOfDay,
            'place -> game.place).as(Game.simple.singleOpt)
    }
  }

  /**
   * Retrieve all games.
   */
  def findAll: List[Game] = {
    DB.withConnection { implicit connection =>
      SQL("select * from game").as(parser.*)
    }
  }
}