package Problems.GlobalVariable
var manoh=" Yes I am for this work"
fun main() {
    GlobalVeriable(18018, "Sagnik")
    GlobalVeriable(11011)
    GlobalVeriable()
}
class GlobalVeriable(emp_id : Int = 100 , emp_name: String = "abc") {
    val id: Int
    var name: String
    init {
        id = emp_id
        name = emp_name
        println("$manoh ")
        println("Employee id is: $id, ")
        println("Employee name: $name")

    }
}