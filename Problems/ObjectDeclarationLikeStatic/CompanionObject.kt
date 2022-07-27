package Problems.ObjectDeclarationLikeStatic
// Access the data from inner clas by using Base class
class CompanionObject {
    companion object CustomerData{
        var id:Int=34 // Behaving as static
        fun myFunction():String{
            return "Indian"
        }
    }
}

fun main() {
    println(CompanionObject.id)
    println(CompanionObject.myFunction())
}