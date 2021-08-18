package kotlin_Day01

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    val map: HashMap<Char, Int> = LinkedHashMap()
    for (ch in str) {
        if (map.containsKey(ch)) {
            val count = map[ch]
            if (count != null) map[ch] = count + 1
        } else if (ch != ' ') {
            map[ch] = 1
        }
    }
    for (key in map.keys) {
        println("$key - ${map[key]}")
    }

}