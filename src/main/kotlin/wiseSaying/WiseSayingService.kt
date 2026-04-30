package wiseSaying

class WiseSayingService(
    val wiseSayingRepository: WiseSayingRepository = WiseSayingRepository()
) {


    fun write(content: String, author: String): WiseSaying =
        WiseSaying(content = content, author = author).also {
            wiseSayingRepository.save(it)
        }

    fun findAll() = wiseSayingRepository.findAll()

    fun findById(id: Int): WiseSaying? =
        wiseSayingRepository.findById(id)

    fun delete(wiseSaying: WiseSaying) = wiseSayingRepository.delete(wiseSaying)

    fun modify(wiseSaying: WiseSaying, content: String, author: String) {
        wiseSaying.modify(content, author)
    }
}