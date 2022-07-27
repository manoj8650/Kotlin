package Problems.Constractor

fun main() {
    var d=Constructor("Toyota","TCS")
    println(d.color)
    println(d.brand1)

}
class Constructor(var name:String, var brand:String) {
    var color=name
    var brand1=brand

    init {
        println("Manoj")
    }

    init {
        println("Sachin")
    }

}