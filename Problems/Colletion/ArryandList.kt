package Problems.Colletion

fun main() {
    var arraylist=ArryandList()
    arraylist.collection()
    arraylist.listdata()
}
class ArryandList {
    fun collection() {
        val arr = arrayOf("Manoj Kumar", "Sachin Pal", "Ram Kumar")
        println(arr[2])
        for (item in arr) println(item)
        //set data in the array
        arr[2] = "Yoyo haney Singh"
        for (item in arr) println(item)
        //set data in array
        arr.set(1, "Harsh Gupta")
        for (item in arr) println(item)
        // how get data from deffrent method
        var d = arr.get(2)
        println(d)
        // get size of the index
        for (i in 0..arr.size - 1)
            println(" index $i = ${arr[i]}")
    }

fun listdata(){
    var  list= listOf<String>("Manoj","Manprit","Harsh ","Vishal")

}
}