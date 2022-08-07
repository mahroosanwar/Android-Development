//mutable list & map

fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val intrestingThings = listOf("Kotlin", "programming", "Books")

    sayHello(greeting = "hi ", intrestingThings)
}
