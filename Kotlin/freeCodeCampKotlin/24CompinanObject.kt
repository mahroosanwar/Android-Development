//companion object is scoped to an instance of another class, it has access to private properties and method of that in a closing class

interface IdProvider {
    fun getID() : String
}

class Entity private constructor(val id: String) {

    companion object Factory : IdProvider {

        override fun getID(): String {
            return "123"
        }

        const val id = "id"
        fun create() = Entity(getID())
    }
}

fun main() {
//    val entity = Entity(id:"id")  /*error: can't access privater to entity, so we have to use companion object */

    val entity = Entity.create()

    Entity.id
}
