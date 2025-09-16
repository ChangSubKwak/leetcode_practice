import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LC1935_Maximum_Number_of_Words_You_Can_Type_Test {

    @Test
    fun testLexicalOrder() {
        val test = LC1935_Maximum_Number_of_Words_You_Can_Type()

        assertEquals(test.canBeTypedWords("hello world", "ad"), 1)
        assertEquals(test.canBeTypedWords("leet code", "lt"), 1)
        assertEquals(test.canBeTypedWords("leet code", "e"), 0)
    }
}