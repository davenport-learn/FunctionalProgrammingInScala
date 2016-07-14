package io.christopherdavenport.fpinscalamultitool

/**
  * Created by davenpcm on 7/5/16.
  */
trait Option[+A] {
  def map[B](f: A => B): Option[B] = this match {
    case Some(a) => Some(f(a))
    case None => None
  }


}

case class Some[+A](get: A) extends Option[A]
case object None extends Option[Nothing]

object Option{

}