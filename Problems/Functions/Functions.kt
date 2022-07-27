fun main() {
    oddEven(10)
    oddEven(13)
    print( adds(10,19))

}
fun oddEven(num3:Int){
    if (num3%2==0){
      print( "even ")
    } else {
       print( "odd")
    }
}
private fun adds(num:Int, num2:Int):Int {
var result = num+ num2
return result
}



