//Variable 1

val name: String = "Mahroos"
var greeting: String = "Hello"

// in kotlin types are non null by default
var emotion: String? = "happy"
fun main() {
//    var getName: String = "Mahroos"
    println(greeting)
    println(name)


    val lastName: String = "Anwar"
    println("Are You ${emotion}")
//    lastName = "Javed"            Read-only local variables are defined using the keyword "val".
//                                  They can be assigned a value only once.
    println(lastName)

    emotion = null

    greeting = "hi"
    println(greeting)
    println(name)
    println(emotion)

}
