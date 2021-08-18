package kotlin_Day01

fun main() {
    var ar = arrayOf(arrayOf(90, 32, 51, 1, 56), arrayOf("A", "E", "I", "O", "U"))
    ar.forEachIndexed{Index, Element->
        var n = Index+1
        println("Reverse of array $n")
        arrayReverse(Element)
    }
}

fun arrayReverse(element: Array<out Any>) {
    element.forEachIndexed{ idx, _ ->
        println(element[element.lastIndex-idx])
    }
}
