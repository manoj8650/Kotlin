package Problems.Enumall


enum class Enums {
    // enums constaints constaint vaule
    SILVER,     // ordinal=0  name= SILVER
    GOLD,       //ordinal=1    name=GOLD
    PLATINUM    // ordinal=2   name=PLATINUM

}

fun main() {
// eNUS CONSTANTS ARE OBJECTS OF ENUS CLASS TYOE
 // Each Enums have two properties : ordinal, name
    println(  Enums.SILVER.name)
    println(  Enums.GOLD.ordinal)
    println(  Enums.GOLD.name)
    println(  Enums.PLATINUM.ordinal)
    println(  Enums.PLATINUM.name)
    //Each Enums objects has two methos: values() and valueOf()
    val myConstant:Array<Enums> = Enums.values()
       for (i in myConstant){
           println(i)
       }

    // when condtion in inside enum
    var obj: Enums = Enums.PLATINUM
    when(obj){
        Enums.GOLD -> println(" this is Glod Card")
        Enums.SILVER ->println(" this is Silver Card")
        Enums.PLATINUM ->println(" this is Platinum Card")
    }
}