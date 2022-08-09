//Inheritance

//class are close by default - to extend the class by provide open keyword  (open BasicInfoProvider)

class FancyInfoProvider: BasicInfoProvider() {

    override val sessionIDPrefix: String
        get() = "Fancy Seession"

    override val providerInfo: String
        get() = "fancy info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}
