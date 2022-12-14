import java.util.*

//Sealed Class : allow us to defined restricted class hierarchy
//Data Class :: it provide v esy concise , immutable datatypes

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
fun main() {

    val entity : Entity = EntityFactory.create(EntityType.EASY)

    val msg = when(entity) {
        Entity.Help -> "help class"
        is Entity.Easy -> "easy class"
        is Entity.Medium -> "medium class"
        is Entity.Hard -> "hard class"
    }
    println(msg)
}
