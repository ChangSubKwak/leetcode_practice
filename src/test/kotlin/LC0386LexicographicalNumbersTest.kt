import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LC0386LexicographicalNumbersTest {

    @Test
    fun testLexicalOrder() {
        val test = LC0386LexicographicalNumbers()

        assertEquals(test.lexicalOrder(13), listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 6, 7, 8, 9))
        assertEquals(test.lexicalOrder(2), listOf(1, 2))
    }
}