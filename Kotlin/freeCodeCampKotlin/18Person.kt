//add a method in persoon class

class Person(val firstName: String = "Mahroos", val lastName: String = "Anwar") {

    var nickName: String? = null
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
