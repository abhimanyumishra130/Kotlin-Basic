import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    val arr = arrayOfNulls<Int>(len)
    for(i in 0 until len) arr[i] = sc.nextInt()

    val list = mutableListOf<Int>()
    for(i in 0 until len){
        if(list.contains(arr[i])){
            list.remove(arr[i])
        }else{
            arr[i]?.let { list.add(it.toInt()) }
        }
    }

    for(i in list) print("$i ")

}