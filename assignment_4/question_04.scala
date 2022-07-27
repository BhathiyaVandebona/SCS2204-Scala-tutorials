import scala.io.StdIn.readDouble

object question_04 {
  def main(args: Array[String]): Unit = {
    print("Enter a number :")
    val input = readDouble()
    input match {
      case input if input <= 0 => println("Negative/Zero")
      case input if input % 2 == 0 => println("This is an even number")
      case _ => println("This is an odd number")
    }
  }
}
