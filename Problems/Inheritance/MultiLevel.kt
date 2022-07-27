package Problems.Inheritance

open class MultiLevel(var name:String ){
    fun  school(){
        println(" This is my school name $name")
    }
}
open class Degrees: MultiLevel/*("MLIC College")*/ {
    var s =""

    constructor( s: String) :super("MLIC College"){
        this.s=s
    } // follow two way
    fun degree(){
        println(" Degree collge $s ")
    }
}
class Student: Degrees(" Ambala collge of enginnering and apllied research") {
    fun student(){
        println(" Student Attendents ")
    }
}

fun main() {
    var s=Student()
    s.student()
    s.degree()
    s.school()
}