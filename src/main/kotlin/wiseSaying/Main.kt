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
        }
    }
}
