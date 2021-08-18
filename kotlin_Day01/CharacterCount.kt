package kotlin_Day01

fun main() {
    val ar = arrayOf("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var charCount = 0
    for(str in ar) {
        charCount += str.length
    }
    print(charCount)
}