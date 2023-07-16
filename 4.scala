def main(args: Array[String]): Unit = {
  print("Enter an integer number: ")
  val num = scala.io.StdIn.readInt()
  Check_even_odd(num)
  ()
}
def Check_even_odd(n:Int):Unit={
    if(n==1){
        println("Number is Odd")
    }
    else if(n==1){
        println("Number is Even")
    }
    else{
        Check_even_odd(n-2)
    }
}