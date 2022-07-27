package Problems.Inheritance


// when you will create primary construtor you do not create secondary constructor
open class UseThisKeyword(var banks:String){
           constructor():this("ICIC")
    fun withdral(){
        println(" This is my my $banks")
    }

}
class DOB( var amount:String): UseThisKeyword("SBI") {
    constructor() : this("97937537")
    fun diposit(){
        println(" DOB Manoey $amount")
    }
}
class RR:UseThisKeyword{
    constructor():super("Punjab nation Ban"){

    }
}
fun main() {
    var baj=DOB()
    baj.withdral()
    var s=RR()
    s.withdral()
    baj.diposit()
}