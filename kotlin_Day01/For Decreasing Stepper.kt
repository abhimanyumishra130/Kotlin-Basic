package kotlin_Day01

import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    var starting  = sc.nextInt()
    var decrement = sc.nextInt()
    for (i in starting downTo 0 step decrement){
        println(i)
    }
}