import scala.annotation.tailrec

// This is a case class of a shoppingItem
case class shoppingCart(items: List[shoppingCartItem])
case class shoppingCartItem(itemName: String, itemPrice: Double, quantityBought: Int)

object question_02 {
  @tailrec
  def printItems(listOfItems: List[shoppingCartItem]) : Unit = listOfItems match {
    case List() => ()
    case shoppingCartItem(name, price, amount)::tail =>
      println(amount + " " + name + " at Rs." + price + " each")
      printItems(tail)
  }

  def searchCart(cart: shoppingCart, target: String): Unit = cart match {
    case shoppingCart(List()) => ()
    case shoppingCart(list) => list match {
      case List() => ()
      case shoppingCartItem(name, price, amount)::tail if name == target =>
        println (amount + " " + name + " at Rs." + price + " each")
        searchCart(shoppingCart(tail), target)
      case _ :: tail => searchCart(shoppingCart(tail), target)
    }
  }

  def main(args: Array[String]): Unit = {
    val itemList: List[shoppingCartItem] = List(shoppingCartItem("Vanilla Ice Cream", 3.99, 13), shoppingCartItem("Chocolate Biscuits", 4, 6), shoppingCartItem("Cup Cakes", 7.77, 7))
    val cart1 = shoppingCart(itemList)
    printItems(itemList)
    val itemList2: List[shoppingCartItem] = List(shoppingCartItem("Vanilla Ice Cream", 3.99, 13), shoppingCartItem("Chocolate Biscuits", 4, 6), shoppingCartItem("Vanilla Ice Cream", 3.99, 3), shoppingCartItem("Cup Cakes", 7.77, 7))
    printItems(itemList2)
    println()
    searchCart(shoppingCart(itemList2), "Vanilla Ice Cream")
  }
}


