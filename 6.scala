def printFibonacci(n: Int): Unit = {
  def fibonacciHelper(a: Int, b: Int, count: Int): Unit = {
    if (count > 0) {
      print(a + " ")
      fibonacciHelper(b, a + b, count - 1)
    }
  }

  if (n > 0) {
    print(0 + " ")
    fibonacciHelper(0, 1, n - 1)
  }
}

def main(args: Array[String]): Unit = {
  println("Enter your Number:")
  val num1 = scala.io.StdIn.readInt()
  printFibonacci(num1)
}