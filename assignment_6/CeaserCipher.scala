/*

***THIS PROGRAM ONLY WORKS WITH LOWERCASE WORDS AND STRINGS***

Encrypted character = (text character index + shift) mod numberOfLettersInTheAlphabet

take the plain text and for each given character, find the index form the alphabet
shift the alphabet the correct amount
modulo the resulting index (to make user the  resulting index is inside the alphabet)
then take the relevant character from the alphabet regarding the resultant index
add that to the ciphertext


Decrypted character = (cipher character index - shift) mod numberOfLettersInTheAlphabet

take a character from the cipher and reduce the shift from it
modulo the resulting index (positive or negative)
if the index is positive then take the relevant character from the alphabet and
put it in the plain text
else instead of looking up add the number of letters in the alphabet to the number
then take the resulting number as the final index and get the relevant index from the
alphabet and add it ot the plain text
*/

object CeaserCipher {

  val shift: Int = 3 // determines the skips
  val numberOfLettersInAlphabet = 26 // english alphabet
  val charToIntAlphabet: scala.collection.mutable.Map[Char, Int] = makeAlphabet()
  val intToCharAlphabet: scala.collection.mutable.Map[Int, Char] = makeAlphabet().map { case (key, value) => (value, key) }

  def makeAlphabet(): scala.collection.mutable.Map[Char, Int] = {
    // the alphabets starts from zero index
    var i = 0
    val map: scala.collection.mutable.Map[Char, Int] = scala.collection.mutable.Map()
    while(i < 26) {
      map.addOne((i + Char.char2int('a')).toChar, i)
      i += 1
    }
    map
  }

  def encryptPlainText(plainText: String): String = {
    if (plainText.isEmpty) ""
    else {
      plainText.foldLeft("")((accumulator, element) => {
        if (element > 'z' || element < 'a') { // this is for punctuation or any other symbols
          accumulator :+ element
        } else {
          accumulator :+ intToCharAlphabet((charToIntAlphabet(element) + shift) % numberOfLettersInAlphabet)
        }
      })
    }
  }

  def decryptCipherText(cipher: String): String = {
    if (cipher.isEmpty) ""
    else {
      cipher.foldLeft("")((accumulator, element) => {
        if (element > 'z' || element < 'a') { // this is for punctuation or any other symbols
          accumulator :+ element
        } else {
          if (charToIntAlphabet(element) - shift < 0) { // if the number is less than zero this means that the character must be taken
                                                    // backwards from the place
            accumulator :+ intToCharAlphabet((charToIntAlphabet(element) - shift) % numberOfLettersInAlphabet + numberOfLettersInAlphabet)
          } else {
            accumulator :+ intToCharAlphabet((charToIntAlphabet(element) - shift) % numberOfLettersInAlphabet) // This is for positive numbers
          }
        }
      })
    }
  }

  def main(args: Array[String]): Unit = {
    println(encryptPlainText("scala"))
    println(decryptCipherText(encryptPlainText("scala")))
  }
}