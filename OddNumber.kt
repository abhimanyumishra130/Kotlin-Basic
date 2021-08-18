import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the Number")
    val num = scanner.nextInt()

    if(num%2!=0) print("Odd Number")
    else print(" Even Number")
}