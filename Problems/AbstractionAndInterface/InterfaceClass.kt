package Problems

interface InterfaceClass {
    fun toyota()
    fun redmi(){
        println("Redmi is a Phone")
    }
}
class GG:InterfaceClass {
    override fun toyota() {
        println("Toyota is car Brand")

    }

}
fun main() {
    val s=GG()
    s.redmi()
    s.toyota()
}