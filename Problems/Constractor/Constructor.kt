package Problems

fun main() {
    val kotlin = "🙂"
    // println(kotlin)
    //var parent=Parent("Manoj Kumar")
    //  println(parent.name)// direct call parameter by using object of constructor
    //parent.displayDetails()
    var secondary=Secondary("Sachin ","Pal" ,kotlin)
    secondary.consts()
}


// this is Primary constructor
class Parent(var name:String){
    var fullname:String

    init{
        this.fullname=name
    }
    fun displayDetails(){
        println(" this is my fullname: ${fullname}")}
}

// this is a secondary constructor
// inside the constructor variable is not allow as like(var,val)
//
//
//
class Secondary{
    var fullname:String
    var title:String
    val kotlin:String
    constructor(  name:String, title:String,kotlin:String){
        this.fullname=name
        this.title=title
        this.kotlin=kotlin
    }
    fun consts(){
        println(" this is s secondary constructor : ${fullname} ${title} ${kotlin}")
    }
}
