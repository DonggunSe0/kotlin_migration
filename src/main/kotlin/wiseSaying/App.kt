package wiseSaying

class App(
    val wiseSayingController: WiseSayingController = WiseSayingController(),
    val systemController: SystemController = SystemController()
) {

    fun run() {
        var lastId = 0
        val wiseSayings = mutableListOf<WiseSaying>()

        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")

            val input = readln()
            val rq = Rq(input)

            when (rq.action) {
                "종료" -> systemController.exit()
                "등록" -> wiseSayingController.write()
                "목록" -> wiseSayingController.list()
                "삭제" -> wiseSayingController.delete(rq)
                "수정" -> wiseSayingController.modify(rq)
            }
        }
    }
}
