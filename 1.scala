def main(args: Array[String]): Unit = {
  print("Enter an integer number: ")
  val num = scala.io.StdIn.readInt()
  prime(num)
}

def prime(n: Int): Unit = {
  if (n <= 1) {
    println("False")
  } else {
    println(checkPrime(n, 2))
  }
}

def checkPrime(n: Int, divisor: Int): Boolean = {
  if (divisor >= n) {
    true
  } else if (n % divisor == 0) {
    false
  } else {
    checkPrime(n, divisor + 1)
  }
}