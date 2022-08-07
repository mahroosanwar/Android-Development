//list Syntex

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val intrestingThings = listOf("Kotlin", "programming", "Books")

    intrestingThings.forEach { intrestingThing->
        println(intrestingThing)
    }
}
