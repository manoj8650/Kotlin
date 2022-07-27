package Problems.Inheritance
// Super Keyword Used
open class ConsAndInheritance (var name:String) {
    fun display(){
    println( "This is my name  $name")
}
var number =8650713027
}
class Child:ConsAndInheritance{
    constructor() : super("Manoj Kumar"){
        println(" Secondary Constructor ")
    }
    constructor(author:String):super("chercher tech"){
        println("Author name is $author")
    }
    fun calling (){
        display()
        println(number)
    }
}
fun main(){
    var child = Child()
    child.calling()
    var second=Child("Ram Kishore")
    second.calling()
}