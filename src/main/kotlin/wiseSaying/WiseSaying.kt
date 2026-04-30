package wiseSaying

data class WiseSaying(
    var id: Int = 0,
    var content : String,
    var author : String
){
    fun modify(content: String, author: String) {
        this.content = content
        this.author = author
    }

    fun isNew() = id == 0
}
