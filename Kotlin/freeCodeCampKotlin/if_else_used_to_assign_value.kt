 //if and when can also used as expression to assign value

 val name = "Mahroos"
 var greeting: String? = null

 fun main() {
     greeting = "Hello"
     val greetingToPrint = if(greeting != null) greeting else "Hi"

     println(greetingToPrint)
     println(name)
 }
