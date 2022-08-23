object question_05 {

  // This is inclusive; will add the bound as well is the bound is even
  def additionOfEvenNumbersUpToBound (bound: Int): Int = bound match {
    case 1 => 0
    case x if  x % 2 == 0 => x + additionOfEvenNumbersUpToBound(bound - 1)
    case _ => additionOfEvenNumbersUpToBound(bound - 1)
  }

  def main(args: Array[String]): Unit = {
    println(additionOfEvenNumbersUpToBound(10))
  }

}
