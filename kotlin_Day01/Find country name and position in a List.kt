package kotlin_Day01

import java.util.*

fun main() {
    //countries = ["India", "Aus", "England" , "Canada", "India", "USA", "USA", "Japan", "China", "UK"]
    //India Aus England Canada India USA USA Japan China UK
    //countries = ["India", "Aus", "England" , "Canada", "England", "USA", "USA", "Japan", "China", "UK"]
    //India Aus England Canada England USA USA Japan China UK
    val sc = Scanner(System.`in`)
    val ar = arrayOfNulls<String>(10)
    for(i in ar.indices) ar[i] = sc.next()
    print("Enter the country you want to search - ")
    val name = sc.next()
    if(ar.contains(name)) {
        ar.forEachIndexed { idx, value ->
            if(value.equals(name)) println("$value $idx")
        }
    } else {
        println("Not Found")
    }
}