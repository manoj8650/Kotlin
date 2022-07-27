package Problems.OOPs.Encapsulation

import Problems.OOPs.Encapsulation.Student as Student

fun main() {
 //val student=Student( roll = 56, age = -1, name = "Manoj")
 val student=Student("Manoj Kumar",-56,-56 )
    student.setName("Ram Krishna ")
    student.setAge(78)
    student.setRoll(73)
    println(student.getName())
    println(student.getAge())
    println(student.getRoll())

}


