// everytime you make an instance of the Car there will be a value generated for the
// uuid field automatically
object Car {
  // the uuid is generated by combining the name of the vehicle and it's hash code
  def generateUUID (name:String) : String = {
    name + " -- " + name.hashCode
  }
}

case class Car(val name:String, val price:Double) {
  var uuid:String = Car.generateUUID(name)
}

object question_03 {
  def main(args: Array[String]): Unit = {
    val map = Map("BMW 3 series" -> 20_000, "BMW 5 series" -> 50_000, "VW golf" -> 10_000, "VW passat" -> 12_000, "MAZDA 3" -> 15_000)
    // fold the map left and create a list of Car objects
    val listOfCars = map.foldLeft(List[Car]()){case (acc, kv) => Car(kv._1, kv._2) +: acc}
    // use an iterator on the resulting list to print out the uuid of each Car
    listOfCars.foreach(element => println("car uuid = " + element.uuid))
  }
}