//Interface in Kotlin _ 1

//main.it & Person.kt is same as previous 18

interface PersonInfoProvider {
    fun printInfo(person: Person)
}

class BasicInfoProvider : PersonInfoProvider {
    override fun printInfo(person: Person) {
        println("basicInfoProvider")
        person.printInfo()
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}
