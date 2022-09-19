object TestPoint {
  def main(args: Array[String]): Unit = {
    val point1: Point = Point(10, 8)
    val point2: Point = Point(0, 4)
    println(point1 + point2)
    println(point1 distance  point2)
    val curriedMoveFunction = point1 move(8, _)
    println(curriedMoveFunction(10))
    println(point1.invert)
  }
}
