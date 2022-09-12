/*
* Please use the validator function to create a RationalNumber object;
* if you are not user about the denominator of the rational number
* */
package Q1.Rational

// This is declared as a case class with a private
// constructor
case class RationalNumber private (p: Int, q: Int) {
  // this is a good method to validate the input constructor
  // parameters but it's not always good
  // instead use a companion object for validation it's much more
  // flexible
  require(q != 0, "This is not good the denominator is zero")
  private def value: Double = p / q // this used for comparisons

  def efficientGCD(a: Int, b: Int): Int = {
    if (b == 0) return a
    efficientGCD(b, a % b)
  }

  // Question 01
  def neg(): RationalNumber = {
    if (p > 0 && q > 0) {
      RationalNumber(-1 * p, q)
    } else if (p > 0 && q < 0) {
      RationalNumber(p, -1 * q)
    } else if (p < 0 && q > 0) {
      RationalNumber(-1 * p, q)
    } else {
      RationalNumber(-1 * p, -1 * q)
    }
  }

  // Question 02
  // If needed this can be translated to a value based structure
  def + (that: RationalNumber): RationalNumber = {
    val newP = that.p * q + p * that.q
    val newQ = that.q * q
    if (newP != 0) {
      val gcd = efficientGCD(newP, newQ)
      RationalNumber(newP / gcd, newQ / gcd )
    } else RationalNumber(newP, newQ)
  }

  def - (that: RationalNumber): RationalNumber = {
    val newP =  p * that.q - that.p * q
    val newQ = that.q * q
    if (newP != 0) {
      val gcd = efficientGCD(newP, newQ)
      RationalNumber(newP / gcd, newQ / gcd )
    } else RationalNumber(newP, newQ)
  }
}

// But in this method the companion class must be used to
// create the object otherwise validation fails
object RationalNumber {
  // this is used to validate the parameters passed in
  // this function will be called everytime a RationalNumber
  /// object is created
  def newRationalNumber(p: Int, q:Int): Option[RationalNumber] = {
    if (q == 0) None
    else {
      Some(RationalNumber(p, q))
    }
  }
}