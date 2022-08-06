//When Statement is very similar to Java

val name = "Mahroos"
var greeting: String? = null

fun main() {
//    greeting = "Hello"
    when(greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }

    println(name)
}
