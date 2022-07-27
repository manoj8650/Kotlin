package Problems.Inputs

fun main() {
    var n=HowTotakesInput();
    n.input()
}
class HowTotakesInput {
fun input() {
    print("Enter text: ")
    val input = readLine()
    print("You entered: $input")
}
}