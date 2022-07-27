package Problems.ObjectDeclarationLikeStatic

// this is alternative of the static keyword  as like java

open class ObjectDeclaration{
   open fun myName(str:String ){
        println("ObjectDeclaration")
    }
}
// this is singleTon class
// we have access all member and funtion ,method without create object
object Customers:ObjectDeclaration(){
    var id:Int=1// Behaving as static variable
    // this function is behaving as static function and method
    fun registerCustomers(){
        println(" this behaving as static function")
    }

    override fun myName(str: String) {// currently , Behaving like static method
        super.myName(str)
        println(" object Customer :" +str)
    }
    init {
        // your data
    }
}

fun main() {
    Customers.id=4556
    println(Customers.id)// calling without creating instance
    Customers.registerCustomers()
    Customers.myName("Sanju")
}