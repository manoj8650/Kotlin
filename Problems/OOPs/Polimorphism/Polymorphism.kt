package Problems.OOPs.Polimorphism

open class Polymorphism {
  open  fun area(value:Double):Double{
        return 0.0
    }
    fun area(){
        println(" Overloading Concept")
    }
}
class Squar :Polymorphism(){
    override fun area(value: Double): Double {
        return value*value
    }
}
class Circule :Polymorphism(){
    override fun area(radius: Double): Double {
        return 3.14*radius*radius
    }

}


fun main() {
    var squar=Squar()
    var circule=Circule()
    println(squar.area(10.0))
    println(circule.area(10.0))
    println(" ${circule.area()}")
}