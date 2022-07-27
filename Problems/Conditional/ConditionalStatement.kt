fun main(){
//condition()
    //allCondition()
    //switchCase()
    ifcase()
}
fun condition( ){
    var number=5
  //  var  result =number in 1..5
   var result=number in 1 until 5
    // check all number between not equal (1<5) count only 4 conditon is false
    print(result)
}

fun  allCondition(){
    var day="Wednesday"
    if(day=="Monday"){
        print("Today is a monday")
    } else if (day=="tuesday"){
        print("Today is Tuesday")
    }else if (day=="Wednesday"){
        print("Today is Wednesday")
    } else{
        print ("Today is Sunday")
    }
}
fun switchCase(){
    var animal="Dog"
    when(animal){
        "Elephant"-> print("Elephant  ")
        "Horse"-> print("Horse")
        else-> print("No Animal Available")
    }
}
fun ifcase(){
    var max=""
    if (10>90)  max= "10 is big numbert" else max= "90 is a big number"

     println(max)
}