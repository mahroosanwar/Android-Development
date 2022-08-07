//class code
//class Person(_firstName:String, _lastName:String) {
////    val firstName:String
////    val lastname:String
////
//////    init block a peice of code that run anytime if an instance of this class is run
//
////    init {
////        firstName = _firstName
////        lastname =_lastName
////    }
//
//    //this syntex is same as above code to call initialize or init
//    val firstName: String = _firstName
//    val lastname: String = _lastName
//}

// we can even simplify this
class Person(val firstName: String, val lastName: String) {
    //secondary constructor : it can provide the alternatives means for you to instantiate an instance of class
    //for this use the keyword constructor

    init{
        println("init 1")
    }

    constructor() : this("Falah", "Anwar") {
        //now we can define body for the secondary constructor
        println("Secondary Constructor")
    }

    init{
        println("init 2")
    }
}
