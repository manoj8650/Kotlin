package Problems.OOPs.Encapsulation
//Encapsulation concept id hiding the information by using private data member
open class Student {
    private var name="Sachin pal "
    private  var age:Int=5
    private var roll:Int=1
    constructor(name: String, age: Int, roll: Int) {
        if (age > 0) {
            this.age = age
        }else if (roll>0){
            this.roll=roll
        }
        if ((!name.isEmpty())){
            this.name=name
        }
    }
   fun setName(name :String) {
        if ((!name.isEmpty())){
      this.name=name
    }
    }

 fun getName():String {
        return name
    }

  fun setAge(age:Int) {
        if (age > 0) {
            this.age = age
        }
    }

 fun getAge():Int{
        return age
    }

 fun setRoll(roll:Int){
      if (roll>0){
          this.roll=roll
      }
    }

 fun getRoll():Int{
        return roll
    }
}