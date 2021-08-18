package kotlin_Day01

fun main() {
    val str = "Masai"

    print(reverse(str))
}
fun reverse(str:String): String{
    var str1 =""
    var arr = str.toCharArray()
    for(i in arr.size-1 downTo 0){
        str1+=arr[i]
    }
    return str1
}