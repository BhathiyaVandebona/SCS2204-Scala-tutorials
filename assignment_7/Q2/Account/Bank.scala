package Q2.Account

case class Bank(accounts: List[Account]) {
  // Q4.1
  def negativeBalanceAccounts(): List[Account] = accounts.filter(element =>  if (element.credits < 0) true else false)

  // Q4.2
  def bankSum(): Double = accounts.foldLeft(0.0)((accumulator, element) => accumulator + element.credits)

  // Q4.3
  def bankSumOD(rateNonOD: Float, rateOD: Float): Double = accounts.foldLeft(0.0)((accumulator, element) =>  {
    if (element.credits < 0) accumulator + element.credits * rateOD  * -1 + element.credits
    else accumulator + element.credits * rateNonOD + element.credits
  })
}
