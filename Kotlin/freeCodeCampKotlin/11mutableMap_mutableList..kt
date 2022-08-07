//mutable list & map

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val intrestingThings = mutableListOf("Kotlin", "programming", "Books")
    intrestingThings.add("Dog")

    intrestingThings.forEach {intrestingThing -> println(intrestingThing)}

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4, "d")

    map.forEach { key, value -> println("$key -> $value") }
}
