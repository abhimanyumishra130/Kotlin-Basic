package kotlin_Day01

import java.util.*

fun main() {
    //India Australia America China Russia Japan Korea Taiwan Europe Germany
    val sc = Scanner(System.`in`)
    val ar = arrayOfNulls<String>(10)
    for(i in ar.indices) ar[i] = sc.next();
    for(i in 0..1) {
        println("Enter the country you want to search")
        val name = sc.next()
        if(ar.contains(name)) println("Found") else println("Not Found")
    }
}