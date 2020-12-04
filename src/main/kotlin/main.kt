// Cyrillic in console: Run/Edit Configuration/VM options: -Dfile.encoding=UTF-8
fun main() {
    while(true) {
        print("Введите количество лайков (пустая строка - выход):")
        val input = readLine()
        if(input!!.isEmpty()) {
            println("Работа завершена.")
            return
        }

        val likes = input.toInt()
        if(likes > 0) {
            val endsWith1 = likes.toString().endsWith("1")
            val endsWith11 = likes.toString().endsWith("11")

            val peoples = if(endsWith1 && !endsWith11) "человеку" else "людям"

            println("Сообщение: \"что-то понравилось $likes $peoples\"")
        }
    }
}