import Q2.Account.Account
import Q2.Account.Bank

object Q3Q4main {
  def main(args: Array[String]): Unit = {
    var bank = Bank(List(Account(9_000.00), Account(60_000.00), Account(7_000.00)))
    println(bank)
    println(bank.bankSum())
    println(bank.bankSumOD(0.5f, 0.1f))
  }
}
