//map syntex

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val intrestingThings = listOf("Kotlin", "programming", "Books")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    map.forEach { key, value -> println("$key -> $value") }
}
