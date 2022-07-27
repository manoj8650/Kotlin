package Problems.OOPs

fun main() {
val c=   ObjectOrientedProgramming()
//    c.brand="Manoj"
//    c.color="red"
//    c.name="BMW"
//    c.year=2016
   // print(c.name+" "+c.brand+" "+c.color+ " "+c.year)
    c.car("Manoj","BMW","Red",2017)
    c.modelCar()
}
class ObjectOrientedProgramming {
    var name=""
    var brand=""
    var color=""
    var year=0
    fun car(name:String ,brand:String,color:String,year:Int) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    fun modelCar(){
        print(name+" "+brand+" "+color+" "+year)
}
}