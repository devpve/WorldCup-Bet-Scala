package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

case class User(id: Int, name: String, email: String, password: String)

object User {

  /**
   * Parse a User from a ResultSet.
   */
  val simple = {
    get[Int]("user.id") ~
    get[String]("user.name") ~
    get[String]("user.email") ~
    get[String]("user.password") map {
      case id ~ name ~ email ~ password => User(id, name, email, password)
    }
  }

  /**
   * Retrieve a User from email.
   */
  def findByEmail(email: String): User = {
    DB.withConnection { implicit connection =>
      SQL("select * from user where email = {email}").on(
        'email -> email).as(User.simple.single)
    }
  }

  /**
   * Retrieve all users.
   */
  def findAll: Seq[User] = {
    DB.withConnection { implicit connection =>
      SQL("select * from user").as(User.simple *)
    }
  }

  /**
   * Retrieve an user id.
   */
  def findID(user: User) : Option[User] = {

      DB.withConnection { implicit connection =>
        SQL("""
              select ID from user where 
              name = {name} and email = {email}
            """).on(
              'name -> user.name,
              'email -> user.email).as(User.simple.singleOpt)
      }
  }

  /**
   * Authenticate a User.
   */
  def authenticate(email: String, password: String): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
         select * from user where 
         email = {email} and password = {password}
        """).on(
          'email -> email,
          'password -> password).as(User.simple.singleOpt)
    }
  }

  /**
   * Create a User.
   */
  def create(user: User): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into user (name, email, password) values (
            {name}, {email}, {password}
          )
        """).on(
          'name -> user.name,
          'email -> user.email,
          'password -> user.password).executeUpdate()

      Some(user)
    }
  }
}