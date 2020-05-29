import main.scala.Lab1  
import org.scalatest._


class Lab1Tests extends FunSuite {
    test("decToBin equal decToBin(tailrec)") {
        val num = 259
        assert(Lab1.decToBin(num) === Lab1.decToBinTail(num))
    }

    test("return binary number") {
        val num = 259
        assert(Lab1.decToBin(num) === "100000011")
    }

    test("return binary number(tailrec)") {
        val num = 259
        assert(Lab1.decToBinTail(num) === "100000011")
    }
}