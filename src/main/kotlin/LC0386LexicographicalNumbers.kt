class LC0386LexicographicalNumbers {
    fun lexicalOrder(n: Int): List<Int> {
        val result: MutableList<Int> = mutableListOf()
        for (i in 1..9) {
            addDigit(i, n, result)
        }
        return result
    }

    private fun addDigit(num: Int, n: Int, result: MutableList<Int>) {
        if (num <= n) {
            result.add(num)
            for (i in 0..9) {
                addDigit(Integer.valueOf("$num$i"), n, result)
            }
        }
    }
}