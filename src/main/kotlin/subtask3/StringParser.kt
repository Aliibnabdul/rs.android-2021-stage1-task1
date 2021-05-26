package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var s1: String // []
        var s2: String // <>
        var s3: String // ()
        val al = mutableListOf<String>()

        inputString.forEachIndexed { i, ch ->
            if (ch == '[') {
                s1 = inputString.substring(i + 1) // обрезаем все, что до открывающей
                s1 = s1.substring(0, findLastIndex(s1, ch, ']'))
                println(s1)
                al.add(s1)
            }

            if (ch == '(') {
                s2 = inputString.substring(i + 1) // обрезаем до открывающей
                s2 = s2.substring(0, findLastIndex(s2, ch, ')'))

                println(s2)
                al.add(s2)
            }

            if (ch == '<') {
                s3 = inputString.substring(i + 1) // обрезаем до открывающей
                s3 = s3.substring(0, findLastIndex(s3, ch, '>'))
                println(s3)
                al.add(s3)
            }
        }
        return al.toTypedArray()
    }

    private fun findLastIndex(s: String, startChar: Char, lastChar: Char): Int {
        var cCounter = 0

        for (j in s.indices) {
            if (s[j] == startChar) cCounter++
            if (s[j] == lastChar) {
                if (cCounter == 0) return j // возвращаю индекс закрывающей скобки
                else cCounter--
            }
        }
        return s.length // если закрывающая скобка не найдена, возвращаю длину строки
    }
}
