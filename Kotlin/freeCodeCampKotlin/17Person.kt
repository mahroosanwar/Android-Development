//Getter and Setters

//in kotlin getter and setter automatically generated by compiler
//default: for val getter generated and for var getter and setter generated

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
}