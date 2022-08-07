//named argument :which parameter this argument value is going to be used for

fun sayHello(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Falah") = println("$greeting $name")

fun main() {
    greetPerson(greeting = "Hi", name = "Mahroos")

    //if we used '=' sign after the parameter this allows us with the flexibility with order of arguments
    greetPerson( name = "Mahroos", greeting = "Hi")

    //if we pass the default value for function parameters it's allow us to leave some/all argument value for some parameter
    greetPerson(name = "Falah")
}
