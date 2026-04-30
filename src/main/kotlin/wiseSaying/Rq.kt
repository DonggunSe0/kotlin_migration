package wiseSaying

class Rq(
    val cmd: String,
) {

    fun getParam(paramName: String, defaultValue: String) : String{

        val cmdBits = cmd.split("?")

        if(cmdBits.size < 2) {
            return defaultValue
        }

        val queryString = cmdBits[1]

        val paramMap = queryString
            .split("&")
            .mapNotNull{
                val paramBits =it.split("=", limit = 2)
                if(paramBits.size != 2) {
                    null
                }else{
                    paramBits[0] to paramBits[1]
                }
            }
            .toMap()

        return paramMap[paramName] ?: defaultValue

    }
}