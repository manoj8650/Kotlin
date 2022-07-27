//Arithmetic Operators - there are five type of Arithmetic Operators
/*
* 1. Addition
* 2. subtractions
* 3. Division
* 5. Multiplication
* 6. Modules
* */
fun main() {
//    var a=10
//    var b=5
//    val v=a+b
//    val v1=a*b;
//    val v2=a/b
//    var v3=a-b
//    var v4=a%b
//    println(v)
//    println(v1)
//    println(v2)
//    println(v3)
//    println(v4)
   // ram();
   // increment()
    logical()
}

// logical Operator
// && And Operator
// || Or operator
// ! not OperaTOR
// Conditional statement like if else and nested if else
fun logical() {

    var above=true
    var knowPrograaming=false
    var languagesjava =true

//    if (above && (!knowPrograaming)||languagesjava) {
//       print(" you are eligible for interviews")
//    }else{
//        print(" you are not eligible for the interviews")
//    }
    var result =if (above && (!knowPrograaming)||languagesjava)  " you are eligible for interviews" else  "you are not eligible for the interviews"
// not available turn-ari operator
print(result)

}


//Relation Operators
/*
* < less then
* > Grater then
* <= less then equal
* >= Greater then equal
* == equal
* = Assignment value
* */
fun ram() {
    var a=5
    var b=4
    if (a<b){
        print("$a Less then value")
    } else {
        print("$b Greater then value ")
    }
}

//Increment and Decrement pre and post
fun increment(){
    var a=10
    var b=4
   // println(a++ + ++b)// 15 pre increment and post increment

      //   10,11  12=22
    //print(a++ + ++a)//22  pre increment and post increment
       // 10,  9  ,8 =18
    print (a-- + --a)   //pre increment and post increment

}