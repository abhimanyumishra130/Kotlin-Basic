package kotlin_Day01

import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    var len = sc.nextInt()
    var arr = arrayOfNulls<Int>(len)
    for(i in 0 until len ) arr[i] = sc.nextInt()

    var b:Boolean = true
    for(i in 0 until len ){
        for(j in 0 until len){
            if(arr[i]==arr[j]  && i!=j){
                print(arr[i])
                print(" ")
                b=false
                break;
            }
        }
    }
    if(b) print(0)

}