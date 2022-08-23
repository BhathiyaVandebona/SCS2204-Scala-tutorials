object question_06 {

  def fibonacci(key: Int): Unit = {
    val map = scala.collection.mutable.Map((1, 0), (2, 1))
    fibonacciSupport(key, map)
    map.values.foreach((x: Int) =>  print(x + ", "))
    println()
  }

  def fibonacciSupport(bound: Int, map: scala.collection.mutable.Map[Int, Int]): Int = {
    map.get(bound) match {
      case Some(value) => value
      case None =>
        map.addOne((bound, fibonacciSupport(bound - 1, map) + fibonacciSupport(bound - 2, map)))
        map.get(bound) match {
          case Some(v) => v
          case None => -1
        }
    }
  }

  def main(args: Array[String]): Unit = {
    fibonacci(10)
  }
}
