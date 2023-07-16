def addition(num: Int): Int = {
  var Sum: Int = 0
  if (num >= 2) {
    Sum = addition(num - 2) + num
  }
  Sum
}

def main(args: Array[String]): Unit = {
  println("Enter your Number:")
  val num1 = scala.io.StdIn.readInt()
  var num2 = 0
  if (num1 % 2 == 0) {
    num2 = num1 - 2
  } else {
    num2 = num1 - 1
  }
  //println(num2)

  val result = addition(num2)
  println("Sum is: " + result)
}