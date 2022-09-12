import Q1.Rational.RationalNumber

object Q1Q2main {
  def main(args: Array[String]): Unit = {
    val r1 = RationalNumber(3, 4)
    val r2 = RationalNumber(5, 8)
    val r3 = RationalNumber(2, 7)
    println(r1 + r2 + r3)
    println(r1 - r2 - r3)
  }
}
