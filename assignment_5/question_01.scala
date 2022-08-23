object question_01 {

  def isPrime(number: Int) = isPrimeSupport(number, number - 1)

  def isPrimeSupport (number: Int, mod: Int): Boolean = {
    if (mod == 1) true
    else number != 1 && (number % mod != 0) && isPrimeSupport(number, mod - 1)
  }

  def main(args: Array[String]): Unit = {
    println(isPrime(17))
  }
}