package wiseSaying

fun main() {
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

            }
        }
    }
}
