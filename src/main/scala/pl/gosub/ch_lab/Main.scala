import io.chymyst.ch.implement

object Main {
  def f[X, Y]: X ⇒ Y ⇒ X = implement
//  def h1[X, Y]: X => Y = implement
  def f2: Int => String = _.toString + "s"
  def f3(a: Int => String): Int = 5
  def f4(a: (Int => String) => Int): Int = 5
  def f5(a: ((Int => String) => Int) => Int): String = "hello" 
  def helper[X, Y]: X => (X => Y) => X = implement
//  def peirce[X, Y]: (((X => Y) => X) => X) => Y = implement
  def wp[A, B]: ((((A ⇒ B) ⇒ A) ⇒ A) ⇒ B) ⇒ B = implement


  def main(args: Array[String]): Unit = {
	println("Hello from main")
	println(f(123)("abc"))
	println(helper(123)(f2))
	println(wp(f5))
  }
} 
