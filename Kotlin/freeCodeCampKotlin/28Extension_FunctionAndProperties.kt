import java.util.*

//Extension function/properties : it is particularly powerful if you are using class that you can't control but you can
//modify the way which they are used
enum class EntityType{
    HELP, EASY, MEDIUM, HARD;

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
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, multiplier = 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity () {

    object Help : Entity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String):Entity()
    data class Medium(val id: String, val name: String):Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float):Entity()
}

//extension function
fun Entity.Medium.printInfo() {
    println("Medium class: $id")
}

//extension properties
val Entity.Medium.info: String
    get() = "Some Info"

fun main() {

    val entity1 : Entity = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.MEDIUM)

    if(entity2 is Entity.Medium) {
        entity2.printInfo()
        entity2.info
    }
}
