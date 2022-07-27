package Problems

open class AccessModifiers () {

    private var a = 10
    protected var d = 109
    public var ac = 16
    internal var f = 18
    protected fun all() {
        println(a)
        println(d)
        println(ac)
        println(f)
    }
}
class A: AccessModifiers {
    constructor() {
        println(all())
    }
    fun ss(){
        println(all())
    }
}

fun main() {
    var a=A()
    a.ss()
    println(a.f)
    println(a.ac)
}