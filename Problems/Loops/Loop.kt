fun main() {
    whileloop()
   dowhile()
    forloop()
}
fun whileloop(){
    var number =1
    while (number<=10){
        println(2*number)
        number++
    }
}
fun dowhile()
{
    var number =1
        do {
            println(2*number)
            number++
        } while (number<=10)
}
fun forloop(){
    var number =1
    for (number in 1..10){
        println(2*number)

    }
}