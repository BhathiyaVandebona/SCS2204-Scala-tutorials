object assignment_3 {
  def main(args: Array[String]) = {
    assignment_3_q_1.exec()
    assignment_3_q_2.exec()
    assignment_3_q_3.exec()
    assignment_3_q_4.exec()
    assignment_3_q_5.exec()
  }
}


object assignment_3_q_1 {
  def areaOfDisk (radius: Double) = math.Pi * radius * radius
  def exec() = println("The area of a disk with a radius of 5 :: " + areaOfDisk(5))
}

object assignment_3_q_2 {
  def celsiusToFarenheit(celsius: Double) = celsius * 1.8000 + 32.00
  def exec() = println("35 degrees in Celsius is :: " + celsiusToFarenheit(35.00) + " degrees in Farenheits")
}

object assignment_3_q_3 {
  def cubeOf[T : Numeric](num: T) = num * num * num
  def volumeOfASphere[T : Numeric](radius: T) = (4 * math.Pi * cubeOf(radius)) / 3
  def exec() = println("The volume of a the sphere with a radius of 5 is :: " + volumeOfASphere(5))
}

object assignment_3_q_4 {
  val coverPriceOfABook = 24.95
  val bookStoreDiscount = 0.4
  val shippingPriceForFirst50Books = 3.00
  val additionalShippingCostPerCopy = 0.75

  // This function assumes that the least amount of book can be ordered is 50
  def shippingCost(totalBooks: Int=50) = shippingPriceForFirst50Books + (totalBooks - 50) * additionalShippingCostPerCopy

  def wholeSaleCost(totalBooks: Int) = totalBooks match {
    case totalBooks if totalBooks >= 50 => coverPriceOfABook * bookStoreDiscount * totalBooks + shippingCost(totalBooks)
    case _ => 0.00
  } 

  def exec() = println("Whole sale cost for 60 copies is :: " + wholeSaleCost(60))
}

object assignment_3_q_5 {
  val easyPaceKmPM = 1 / 8
  val tempoPaceKmPM = 1 / 7
  def totalRunningTime(distanceEasyPace: Double, distanceTempoPace: Double) = (distanceEasyPace / easyPaceKmPM) + (distanceTempoPace / tempoPaceKmPM)
  def exec() = println("Total running time is easy pace distance was 2 km and tempo pace distance was 3 km :: " + totalRunningTime(2, 3))
}
