def checkeven(num:Int):Unit={
    var value = num
    if(value==1){
        println("Your number is odd")
    }
    else if(value==0){
        println("Your number is even")
    }
    else{
        checkeven(value-2)
    }
}
def main(args: Array[String]): Unit = {
  println("Enter your Number:")
  val num1 = scala.io.StdIn.readInt()
  checkeven(num1)
}
