package kotlin_Day01

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    println(if (isLeapYear(year)) "LEAP YEAR" else "NOT LEAP YEAR")
}
fun isLeapYear(year:Int):Boolean{
    if(year%4==0 && (year%400==0 || year%100!=0)) {
        return true
    }
    return false
}