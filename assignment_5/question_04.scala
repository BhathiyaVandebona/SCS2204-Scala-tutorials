object question_04 {

  def isEven(number: Int): Boolean = {
    if (number == 0) true
    else if (number == 1 || number == -1) false
    else isEven(number - 2)
  }

  def main(args: Array[String]): Unit = {
    println(isEven(2))
    println(isEven(101))
  }

}
