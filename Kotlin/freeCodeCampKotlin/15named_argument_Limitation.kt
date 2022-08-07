//named argument :which parameter this argument value is going to be used for
//Limitation
fun sayHello(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Falah") = println("$greeting $name")

fun main() {
    val intrestingThings = arrayOf("Kotlin", "Programming", "Books")
//    sayHello(*intrestingThings, greeting = "Hi")       //this  is wrong it's limitation of named argument
    sayHello(itemsToGreet = *intrestingThings, greeting = "Hi")
}
