package Problems.Enumall

interface CardCashBack{
    fun getCardCashBack(): Float
}

enum class EnumandConstrutor(var color:String="Red" ,val maxLimit:Float=0.4f):CardCashBack {
 SILVER("Gray",78.0f){
     override fun getCardCashBack(): Float =0.43f
 },
    GOLD("YELLOW",6.0f){
        override fun getCardCashBack(): Float=45.4F
    },
PLATINUM("Black",567.0f) {
    override fun getCardCashBack(): Float =78.6f
}
}

fun main() {
 println(EnumandConstrutor.SILVER.color)
    println(EnumandConstrutor.SILVER.getCardCashBack())
}