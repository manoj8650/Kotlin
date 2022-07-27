package Problems.Inheritance

 open class SingleLevel(var shchool :String){
fun  school(){
    println(" This is my school name MLIC college $shchool")
}
}
class Degree(var d:String): SingleLevel("Prathmi Vidhyal") {

    fun degree(){
        println(" Degree collge is $d")
    }
}

fun main() {
var d=Degree("Ambala collge of engineering and apllied research")
    d.school()
    d.degree()
}