package Q2.Account

case class Account(var credits: Double) {
  // require(credits < 0, "Don't thinks you can have " +
    "negative numbers in your account"

  def transfer(toAccount: Account, amount: Double): Unit = {
    toAccount.credits = toAccount.credits + amount
    credits = credits - amount
  }
}
