class LC1935_Maximum_Number_of_Words_You_Can_Type {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val texts = text.split(" ")
        println(texts)

        val letterChars =  brokenLetters.split("")
            .filter { it.isNotEmpty() }

        println(letterChars.joinToString())

        var count = 0
        for (unit in texts) {
            println(unit)
            if (letterChars.any { letterChar -> unit.contains(letterChar) }) {
                count++
            }
        }

        return texts.size - count
    }
}

fun main() {
    val test = LC1935_Maximum_Number_of_Words_You_Can_Type();
    println("${test.canBeTypedWords("hello world", "ad")} == 1")
}