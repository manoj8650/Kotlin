package Problems.Functions



//fun main() {
//  val d= HighOrderFunction()
//  d.hof(2,7,::)
//}
////class HighOrderFunction {
////  fun add(a:Int,  b:Int):Int {
////    return a+b
////
////  }
////  fun hof(a:Int,b:Int, callback:(Int,Int)->Int){
////    println(callback(a, b))
////  }
//
//}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
  return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y
fun main() {
  val sumResult = calculate(4, 5, ::sum)
  val mulResult = calculate(4, 5) { a, b -> a * b }
  println("sumResult $sumResult, mulResult $mulResult")
}