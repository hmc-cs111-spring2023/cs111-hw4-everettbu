import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class CollatzSpec extends AnyFunSuite with Matchers:

  test("Collatz test 0!") {
   collatz(6) should be (3)
  }

  test("Collatz test 1!") {
    collatz(7) should be (22)
  }

  test("Collatz test 2!") {
    collatz(1) should be (4)
  }

  test("Collatz test 3!") {
    collatz(2) should be (1)
  }

  test("Collatz test 4!") {
    collatz(42) should be (21)
  }

  test("Collatz test 5!") {
    collatz(101) should be (304)
  }


  test("Collatz-count test 0!") {
   collatzCount(1) should be (0)
  }

  test("Collatz-count test 1!") {
    collatzCount(101) should be (25)
  }

  test("Collatz-count test 2!") {
    collatzCount(1111) should be (31)
  }

  test("Collatz-count test 3!") {
    collatzCount(267) should be (21)
  }

end CollatzSpec
