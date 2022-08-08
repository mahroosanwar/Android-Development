//Interface in Kotlin - 2

//main.it & Person.kt is same as previous 18

interface PersonInfoProvider {

    val providerInfo : String

    fun printInfo(person: Person) {
        println("basicInfoProvider")
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionID() : String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionID(): String {
        return "Session"
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    provider.getSessionID()

    checkTypes(provider)
}


//check weather this PersonInfoProvider is also the instance of SessionInfoProvider
fun checkTypes(infoProvider: PersonInfoProvider) {
    if(infoProvider !is SessionInfoProvider) {
        println("is a session info provider")
    } else {
        println("not a session info provider")

        //by this we are able to case infoProvider as SessionInfoProvider and call any method or access any properties
        //on it that are on sessionInfoProvider

//        (infoProvider as SessionInfoProvider).getSessionID()

        //kotlin also include smart casting which compiler check a type and validate that type will not change
        //so we don't need to do any additional casting
        //so we don't need to recast above code line - we can simply do

        infoProvider.getSessionID()
    }
}
