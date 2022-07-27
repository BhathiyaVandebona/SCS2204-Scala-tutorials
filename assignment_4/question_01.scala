object question_01 {
  def interest (amount: Double) : Double = amount match {
    case amount if amount <= 20_000 => { (amount * 2)/100 }
    case amount if amount <= 200_000 => { (amount * 4)/100 }
    case amount if amount <= 2_000_000 => { (amount * 3.5)/100 }
    case _ => { (amount * 6.5)/100 }
  }

  def main(args: Array[String]): Unit = {
    println(interest(1000))
  }
}
