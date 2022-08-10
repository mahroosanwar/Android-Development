//Higher Order Function are function that either return another function or it takes function as perimeter values

//fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
//    list.forEach{
//        if(predicate(it)) {
//            println(it)
//        }
//    }
//}

//if function is nullable type
fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach{
        if(predicate?.invoke(it) == true) {
            println(it)
        }
    }
}


//functional types : first class part of language i.e. means we could define a variable of a functional type
//and then pass that variable in any time we needed a function parameter that matched function signature
val predicate: (String) -> Boolean = {
    it.startsWith(prefix = "J")
}

fun getPrintPredicate() : (String) -> Boolean {
    return {it.startsWith(prefix = "J")}
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript")

//    printFilteredStrings(list) {
//        it.startsWith(prefix =  "J")
//    }

    //so insted of invvoking a print filtre string with a llamda pass to it we can pass predicate variable directly
    printFilteredStrings(list, predicate)

    printFilteredStrings(list, getPrintPredicate())
    printFilteredStrings(list, predicate = null)
}
