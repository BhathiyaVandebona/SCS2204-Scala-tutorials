/*
This case class operates on the functional principle of immutability
Every time the current object is altered a new object is returned and
and the caller is not altered.
 */

case class Point(x: Int, y: Int) {
  def +(that: Point): Point = Point(that.x + x, that.y + y)

  def move(distanceX: Int, distanceY: Int): Point = Point(x + distanceX, y + distanceY)

  // find the distance between the two points
  private def square(number: Int): Double = number * number
  def distance(secondPoint: Point): Double = Math.sqrt(square(secondPoint.x - x) + square(secondPoint.y - y))

  def invert(): Point = Point(y, x)
}
