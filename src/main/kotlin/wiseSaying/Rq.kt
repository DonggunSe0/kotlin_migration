package wiseSaying

class Rq(
    cmd: String,
) {
    val action: String
    private val paramMap: Map<String, String>

    init {
        val cmdBits = cmd.split("?")


        action = cmdBits[0]
        paramMap = if (cmdBits.size == 2) {
            cmdBits[1]
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

    fun getParamAsInt(paramName: String, defaultValue: Int): Int {
        return getParam(paramName,"")
            .toIntOrNull() ?: defaultValue
    }
}