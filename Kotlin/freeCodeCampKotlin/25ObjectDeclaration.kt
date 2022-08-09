/* Object Declaration */
object EntityFactory {

    fun create() = Entity(id = "id", name = "name")

}
class Entity (val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name: $name"
    }
}

fun main() {
//    val entity = Entity(id:"id")  /*error: can't access privater to entity, so we have to use companion object */

    val entity = EntityFactory.create()
    println(entity)
}
