fun main() {
//starpattern()
//    pramid()
//    reversstar()
//    starwithnumber()
//    single()
 //   ss()


    //printStars(10)
}
fun starpattern(){
    var a=10;
    for (b in a downTo   1 ){
        //println(b)
        for (b in b .. a){
            print(" $b")
            //print(b)
        }
        println(" ")
    }

}
fun pramid(){
    var  r=5
    for (b in 1..r){
        for (s in 4 downTo r){
            print(" ")
        }
        for (c in 1..r){
            print("*")
        }
        println(" ")
    }

}
fun reversstar(){
    var num=10
    for (i in 1.. num){
        for (j in num downTo i ){
          //  print("* ")
            print(" $j ")
        }
        println(" ")
    }
}
fun starwithnumber(){
    var num=10
    for (t in 1..num){
        for (j in 1..t){
            print(" $j ")
        }
        println(" ")
    }
}
fun single(){
    for (i in 10 downTo 1)
    {
        println(" $i ")
    }
    println(" hello")
}
fun ss(){
    var num=5
    for (i in 1..num){
        for (j in 1..i){
                print(" ")
        }
        for (m in i..num){
            print("$m ")
        }
        println(" ")
    }
    for (d in num-1 downTo 1){
        for (j in 1 until  d){
            print(" ")
        }
        for (k in d..num){
            print(" $k")
        }
        println(" ")
    }
}





