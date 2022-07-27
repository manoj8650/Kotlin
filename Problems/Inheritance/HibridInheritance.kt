package Problems.Inheritance

open class HibridInheritance(var name:String) {
    fun testa(){
        println("testA")
    }
}

open class Child1Class: HibridInheritance("chercher tech"){
    fun testb(){
        println("testB")
    }
}
open class Child2Class: HibridInheritance("chercher tech"){
    fun testd(){
        println("testB")
    }
}
class GrandChildClass:Child1Class(){
    fun testc(){
        println("testC")
    }
}
fun main(args: Array<String>)
{
    var gc = GrandChildClass()
    // calling methods from base and child classes
    gc.testa()
    gc.testb()
    gc.testc()
    var c2c = Child2Class()
    c2c.testd()
    c2c.testa()
}