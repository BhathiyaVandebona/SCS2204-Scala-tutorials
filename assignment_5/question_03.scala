object question_03 {

  def additionUpToBound(bound: Int): Int = bound match {
    case 0 => 0
    case _ => bound + additionUpToBound(bound - 1)
  }

  def main(args: Array[String]): Unit = {
    println(additionUpToBound(5))
  }

}
