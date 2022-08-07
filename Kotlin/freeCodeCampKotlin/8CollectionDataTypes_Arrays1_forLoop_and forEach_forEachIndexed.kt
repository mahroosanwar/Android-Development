// Collection data types: arrays
// for Loop and forEach, forEachIndexed (Lamda Functon)


fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    val intrestingThings = arrayOf("Kotlin", "Programming", "Books")
    println(intrestingThings.size)
    println(intrestingThings[0])
    println(intrestingThings.get(1))

    for(intrestingThing in intrestingThings) {
        println(intrestingThing)
    }


    //forEach takes the another function and returns unit
    //what to do for each iteration : "it" is the default name for each element in the array that we
    //passed in Lamda function (if a function have only parameter is function so we can omit the parentheses
    intrestingThings.forEach {
        println(it)
    }


    //it is  not much mode readable for we can pass a variable with arrow ->
    //but here we lost the index data
    intrestingThings.forEach {intrestingThing_1 ->
        println(intrestingThing_1)
    }

    //with index data

    intrestingThings.forEachIndexed { index, intrestingThing_2 ->
        println("$intrestingThing_2 is at $index")
    }
}

