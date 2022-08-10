fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)

//    list
//        .filterNotNull()

//        .takeLast(n=3)
//        .take(n=3)


//        .filter {
//            it.startsWith(prefix = "J")
//        }
//       .map{
//            it.length
//        }
//        .associate { it to it.length }
//        .forEach {
//            println(it)
//        }
//        .forEach{
//            println("${it.value}, ${it.key}")
//        }

    val map = list
        .filterNotNull()
        .associate { it to it.length }


//    val language = list.first()
//    val language = list.filterNotNull().last()
//    val language = list.filterNotNull().findLast{it.startsWith(prefix = "Java")}
    val language = list.filterNotNull().findLast{it.startsWith(prefix = "foo")}.orEmpty()
    println(language)


}
