package Problems.ScopFuntion
fun main() {
//    val person = Person()
//    person.name="Manoj Kumar"
//    person.age=69
//    println(person.name)
//    println(person.age)

    //Other Better Way
    // this is  scope function . it is higher oder function
    // code is more readable and concise in needed
    val person=Person().apply {  name="Sachin pal"
    age=23
    println(" $name $age")
    }


}
class Person {
    var name:String ? =null
    var age:Int? =null
}