import java.util.*

//Enum Classes
enum class EntityType{
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

object EntityFactory {

    fun create(type: EntityType): Entity {

        val id = UUID.randomUUID().toString()

        val name =  when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
        }
        return Entity(id, name)
    }
}

class Entity (val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name: $name"
    }
}
fun main() {
//    val entity = Entity(id:"id")  /*error: can't access privater to entity, so we have to use companion object */
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)
    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}
