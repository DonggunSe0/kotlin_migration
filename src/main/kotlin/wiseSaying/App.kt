package wiseSaying

class App {
    fun run(){
        var lastId = 0; // 수정이 필요해서 var로 선언
        val wiseSayings = mutableListOf<WiseSaying>()
        println("==명언 앱 ==")
        while(true){
            print("명령)")

            val input = readln()
            when(input){
                "종료" -> {
                    println("프로그램을 종료합니다.")
                    break
                }
                "등록" ->{
                    print("명언 : ")
                    val content = readln()
                    print("작가 : ")
                    val author = readln()
                    val id = ++ lastId

                    WiseSaying(id, content, author)
                        .also {
                            wiseSayings.add(it)
                    }
                    println("${id}번 명언이 등록되었습니다.")

                }
                "목록"->{
                    println("번호 / 작가 / 명언")
                    println("-".repeat(30))
                    wiseSayings.reversed().forEach {
                        println("${it.id}/${it.author}/${it.content}")
                    }
                }
            }
        }
    }
}