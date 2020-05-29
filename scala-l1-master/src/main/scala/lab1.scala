package main.scala

import scala.annotation.tailrec

object Lab1 {
  def main(args: Array[String]) {
    val num = 9
    println(decToBin(num))
    println(decToBinTail(num))
  }

  def decToBin(num: Int): String = {
        def convert(num: Int): String = {
            num match {
                case 0 => ""
                case _ => convert(num / 2) + num % 2
            }
        }
        convert(num)
  }

  def decToBinTail(num: Int): String = {
        def convert(num: Int, accum: String): String = {
            num match {
                case 0 => accum
                case _ => convert(num / 2, num % 2 + accum)
            }
        }
        convert(num, "")
  }
}