package Problems

interface Button{
    // abstract method
    fun clicked();
}
class Phone:Button{
    override fun clicked() {
        println("Phone Button clicked")
    }
}
class Laptop:Button{
    override fun clicked() {
        println("Laptop Button clicked")
    }
}
fun main(args: Array<String>) {
    val derivedPhone = Phone()
    derivedPhone.clicked()
    val derivedLaptop = Laptop()
    derivedLaptop.clicked()
}