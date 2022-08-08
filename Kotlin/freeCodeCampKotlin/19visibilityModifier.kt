//Visibility modifier
//"default" : class are public by default
//"internal" : this class is public inside the module
//"private" : this is only available within file in which it's implemented this is not available in main.kt file
//"protected" : only available with  in the class or within it's subclass

public class Person(val firstName: String = "Mahroos", val lastName: String = "Anwar") {

    //we can apply similar rule in nickname property
    internal var nickName: String? = null
        //setter
        set(value) {
            field = value
            println("new nickname is $value")
        }

        //getter
        get() {
            println("the return value is $field")
            return field
        }

    fun printInfo() {

        /*person.printInfo()*/     // it gives :  "the return value is null" so we need to modify printInfo fun formating
//        val nickNameToPrint = if(nickName != null) nickName else "No Nickname"
        val nickNameToPrint = nickName ?: "No Nickname"         //concise way of upper code
        println("$firstName ($nickNameToPrint) $lastName")

    }

}
