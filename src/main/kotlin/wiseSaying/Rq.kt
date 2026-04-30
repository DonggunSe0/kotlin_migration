package wiseSaying

class Rq(
    cmd: String,
) {

    private val paramMap: Map<String, String>

    init {
        val cmdBits = cmd.split("?")

        val queryString = cmdBits[1]
        paramMap = if (cmdBits.size == 2) {
            queryString
                .split("&")
                .mapNotNull {
                    val paramBits = it.split("=", limit = 2)

                    if (paramBits.size != 2) {
                        null
                    } else {
                        paramBits[0] to paramBits[1]
                    }
                }
                .toMap()
        } else {
            emptyMap()
        }
    }

    fun getParam(paramName: String, defaultValue: String): String {
        return paramMap[paramName] ?: defaultValue
    }
}