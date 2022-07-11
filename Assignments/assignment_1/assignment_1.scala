// Q1 =>
object assignment_1_q_1_2_3 {
  var k = 2
  var i = 2
  var i = 2
  var m = 5
  var n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'
  
  def exe() : Unit = {
    println(k + 12 * m)
    println(m / j)
    println(n % j)
    println(m / j * j)
    println(f + 10 * 5 + g)
    println((i + 1) * n)
  }
}

object assignment_1_q_2 {
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

  b -= 1
  println(b * a + c * d)
  d -= 1
  println(a + 1)
  a += 1
  println(-2 * (g - k) + c)
  c += 1
  println(c)
  var a_prev_val = a
  a += 1
  var c_prev_value = c
  c += 1
  println(c * a_prev_val)
}

// Q4 =>
// Part a.
// Take home salary of an employee
object assignment_1 {

  def main(args: Array[String]) : Unit = {
    assignment_1_q_4_part_1.exe()
    assignment_1_q_4_part_2.exe()
  }
}

object assignment_1_q_4_part_1{

  // Tax rate
  val taxRate : Double = 12/100

  // This function will calculate the normal working hours pay of an employee
  def calcNormalHoursPay(numOfHours: Int) : Double = 150.00 * numOfHours

  // This function will calculate the overtime working hours pay of an employee
  def calcOtHoursPay(numOfHours: Int) : Double = 75.00 * numOfHours

  // This function calculates the total income of an employee
  def totalIncome(nH: Int, otH: Int) : Double = calcNormalHoursPay(nH) + calcOtHoursPay (otH) 

  // This function calculates the total salary of an employee
  def totalTakeHomeSalary(nH: Int, otH: Int) : Double = totalIncome(nH, otH) - calcTax(totalIncome(nH, otH))

  // This function will calculate the tax amount an employee should pay
  def calcTax(income: Double) : Double = income * taxRate

  def exe() : Unit = {
    println(calcNormalHoursPay(40, 20));
  }
}

object assignment_1_q_4_part_2{

  val avgPrice = 15.00

  val avgAttendance= 120

  val costPerShow = 500.00

  val costPerAudienceMember = 3.00

  def totalAttendance(ticketPrice: Double) : Int = 120 + ((ticketPrice - avgPrice) * 20) / 5

  def totalTicketPay(ticketPrice: Double) : Double = totalAttendance(ticketPrice) * ticketPrice

  def totalCostPerShow(attendees: Int) : Double = costPerAudienceMember * attendees + costPerShow

  def totalProfit (ticketPrice: Double) : Double = totalTicketPay(ticketPrice) - totalCostPerShow(totalAttendance(ticketPrice))

  def exe() : Unit = {
    println(totalProfit(30))
  }
}
