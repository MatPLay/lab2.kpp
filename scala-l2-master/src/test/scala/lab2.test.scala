import main.scala.Lab2
import org.scalatest._

class Lab2Tests extends FunSuite {
    test("return reverse") {
        val words = List[String]("test", "big", "boy", "largest")
        assert(Lab2.reverse(words) === List[String]("tset", "gib", "yob", "tsegral"))
    }

    test("return pong") {
        val string = "Test ping match"
        assert(Lab2.pong(string) == "Test ping pong match")
    }
}