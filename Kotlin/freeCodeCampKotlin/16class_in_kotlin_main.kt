//Class in kotlin
fun sayHello(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Falah") = println("$greeting $name")

fun main() {
    //this syntax how to create the new class
//    val person = Person()       //empty constructor

    val person = Person("Mahroos", "Anwar")
    person.firstName
    person.lastName

}

