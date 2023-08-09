package Complexity

fun checkFirst (names: List<String>){
    if(names.firstOrNull() != null){
        println(names.first())

    }else{
        println("no names")
    }

}
fun main(){

    checkFirst(listOf("Abd", "CDF"))

}