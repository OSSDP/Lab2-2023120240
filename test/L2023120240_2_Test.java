import org.junit.Test;
import static org.junit.Assert.*;
//2023120244 验证测试通过
public class L2023120240_2_Test {

    private Solution2 solution2 = new Solution2();

    // 等价类划分原则：空字符串是一个独立的等价类
    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：单个字符的字符串是一个独立的等价类
    @Test
    public void testSingleCharacterString() {
        String input = "a";
        String expected = "a";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：所有字符都是唯一的字符串是一个独立的等价类
    @Test
    public void testAllUniqueCharacters() {
        String input = "abc";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：所有字符都相同的字符串是一个独立的等价类
    @Test
    public void testAllSameCharacters() {
        String input = "aaaaa";
        String expected = "a";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：包含多个重复字符的字符串是一个独立的等价类
    @Test
    public void testMultipleDuplicates() {
        String input = "bcabc";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：包含复杂重复字符的字符串是一个独立的等价类
    @Test
    public void testComplexDuplicates() {
        String input = "cbacdcbc";
        String expected = "acdb";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 边界值分析：字符串长度为1的情况是一个边界条件
    @Test
    public void testBoundaryCase() {
        String input = "z";
        String expected = "z";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：包含所有小写字母的字符串是一个独立的等价类
    @Test
    public void testLongString() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：包含所有小写字母且有重复的字符串是一个独立的等价类
    @Test
    public void testLongStringWithDuplicates() {
        String input = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：逆序字符串是一个独立的等价类
    @Test
    public void testReversedString() {
        String input = "zyxwvutsrqponmlkjihgfedcba";
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：逆序字符串且有重复的字符串是一个独立的等价类
    @Test
    public void testReversedStringWithDuplicates() {
        String input = "zzyyxwwvutsrqponmlkjihgfedcba";
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：包含重复模式的字符串是一个独立的等价类
    @Test
    public void testRepeatedPattern() {
        String input = "abcabcabcabc";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 等价类划分原则：包含复杂模式的字符串是一个独立的等价类
    @Test
    public void testComplexPattern() {
        String input = "abacb";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    // 边界值分析：可能有多个解决方案的字符串是一个边界条件
    @Test
    public void testEdgeCaseWithMultipleSolutions() {
        String input = "abacb";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }
}