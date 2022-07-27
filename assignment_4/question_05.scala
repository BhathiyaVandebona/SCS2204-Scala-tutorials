object question_05 {
  def toUpper(str:String) : String = str match {
    case x if x.isEmpty => ""
    case x => x.toUpperCase
  }

  def toLower(str: String): String = str match {
    case x if x.isEmpty => ""
    case x => x.toLowerCase
  }

  def formatName(name: String, func: (String) => String) : String = func(name)

  def main(args: Array[String]): Unit = {
    println(formatName("Benny", toUpper))
    println(formatName("Niroshan", toUpper))
    println(formatName("Saman", toLower))
    println(formatName("Kumara", toLower))
  }
}
