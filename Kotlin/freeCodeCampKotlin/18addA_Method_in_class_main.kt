//add a method to Person class

fun sayHello(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Falah") = println("$greeting $name")

fun main() {
    val person = Person()
    person.nickName = "Muhammad"
    /*person.printInfo()*/     // it gives :  "the return value is null" so we need to modify printInfo fun formating
    person.printInfo()
}

