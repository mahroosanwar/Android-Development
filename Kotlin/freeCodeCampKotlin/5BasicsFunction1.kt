//Basics Function - 1

fun getGreeting(): String {     //String is return type of the getGreeting functiion
    return "Hello Mahroos"
}

fun sayHello(): Unit {          //Unit is not return any useful types i.e. not return any-thing so we can omit that type value
                                //so we can remove ": Unit" , have no effect
    println(getGreeting())
}

//return type functions are very similar to the variable

fun getGreeting2(): String? {     //return null string
    return null
}

fun getGreeting3() = "Hello Falah"     //String is return type of the getGreeting functiion

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
    println(getGreeting3())
}
