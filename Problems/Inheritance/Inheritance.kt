package Problems.Inheritance//package Problems

fun main() {
    val kotlin = "🙂"
    println(kotlin)
    var emp=Emp("Manoj Kumar $kotlin")
//    emp.id=25347534
//     emp.display()
    emp.displayEmp()
}


open class Person(){
    var id=123
    // function by default final hote hai
    open fun display(){
        println(" This is my id ${id}")
    }
}
class Emp(var name:String):Person(){

    fun displayEmp(){
        println(" this is my name: ${name} and my id ${id}")
        display()
    }
    override fun display(){
        println(" this is child method")
    }

}



//open class BaseClass(var name:String){
//    fun printSomething(){
//        println("The name is $name")
//    }
//    var baseValue = 56
//}
//class DerivedClass: BaseClass {
//    constructor():super("chercher tech"){
//        // i am secondary constructor
//    }
//    fun baseClassFunction(){
//        // calling a base class function
//        printSomething()
//        // calling a base class variable
//        println(baseValue)
//    }
//}
//fun main(args: Array<String>)
//{
//    var d = DerivedClass()
//    // calling derived class method
//    d.baseClassFunction()
//}
































