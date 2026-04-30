package wiseSaying


class WiseSayingRepository {

    var lastId = 0
    val wiseSayings = mutableListOf<WiseSaying>()

    fun save(wiseSaying: WiseSaying): WiseSaying {

        return wiseSaying
            .takeIf { it.isNew() }
            ?.apply {
                id = ++lastId
            }
            ?.also {
                wiseSayings.add(it)
            } ?: wiseSaying
    }

    fun findAll() = wiseSayings.toList()

    fun findById(id: Int): WiseSaying? = wiseSayings.firstOrNull { it.id == id }

    fun delete(wiseSaying: WiseSaying) = wiseSayings.remove(wiseSaying)

}