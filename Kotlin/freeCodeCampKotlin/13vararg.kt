//vararg :- a variable number of argument

fun sayHello(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val intrestingThings = arrayOf("Kotlin", "Programming", "Books")

    //by using vararg we have eliminated the need to always pass in a value after initial argument
    //it will give us the greater flexibility
    sayHello(greeting = "hi ", "kotlin", "Programming", "Notes")

    sayHello(greeting = "hi ", *intrestingThings)

}
