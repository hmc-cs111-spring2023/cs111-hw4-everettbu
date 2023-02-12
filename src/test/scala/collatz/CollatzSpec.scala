import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class CollatzSpec extends AnyFunSuite with Matchers:

  test("0!") {
   collatz(6) should be (3)
  }

  test("1!") {
    collatz(7) should be (22)
  }

  test("2!") {
    collatz(1) should be (4)
  }

  test("3!") {
    collatz(2) should be (1)
  }

  test("4!") {
    collatz(42) should be (21)
  }

  test("5!") {
    collatz(101) should be (304)
  }

end CollatzSpec
