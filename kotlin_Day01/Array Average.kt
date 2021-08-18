package kotlin_Day01

import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    var len = sc.nextInt()
    var arr = arrayOfNulls<Int>(len)
    for(i in 0..len-1) arr[i] = sc.nextInt()

    print(average(arr))
}

fun average(arr: Array<Int?>) : Float{

    var avg:Float=0f
    for(i in arr){
        if (i != null) {
            avg+=i
        }
    }
return avg/arr.size
}
