object question_02 {

  def isPrime(number: Int): Boolean = isPrimeSupport(number, number - 1)

  def isPrimeSupport(number: Int, mod: Int): Boolean = {
    if (mod == 1) true
    else number != 1 && (number % mod != 0) && isPrimeSupport(number, mod - 1)
  }

  def primeSeq(bound: Int): List[Int] = {
    if (bound == 1) List()
    else {
      if (isPrime(bound)) bound +: primeSeq(bound - 1)
      else primeSeq(bound - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(primeSeq(10))
  }
}