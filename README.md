# OSSDP-Lab2

修改后的Solutions2

```
class Solution2 {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!vis[ch - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                vis[ch - 'a'] = true;
                sb.append(ch);
            }
            num[ch - 'a'] -= 1;
        }
        return sb.toString();
    }
}
```

等价类划分如下：

1. **testEmptyString**: 测试空字符串，结果应该是空字符串。

2. **testSingleCharacterString**: 测试单个字符的字符串，结果应该是该字符。

3. **testAllUniqueCharacters**: 测试所有字符都是唯一的字符串，结果应该是原字符串。

4. **testAllSameCharacters**: 测试所有字符都是相同的字符串，结果应该是该字符。

5. **testMultipleDuplicates**: 测试示例 1，结果应该是 “abc”。

6. **testComplexDuplicates**: 测试示例 2，结果应该是 “acdb”。

7. **testBoundaryCase**: 测试边界情况，只有一个字符的字符串。

8. **testLongString**: 测试包含所有小写字母的字符串，结果应该是按字典序排列的字符串。

9. **testLongStringWithDuplicates**: 测试包含所有小写字母且每个字符重复多次的字符串，结果应该是按字典序排列的字符串。

10. **testReversedString**: 测试按字典序逆序排列的字符串，结果应该是原字符串。

11. **testReversedStringWithDuplicates**: 测试按字典序逆序排列且包含重复字符的字符串，结果应该是原字符串。

12. **testRepeatedPattern**: 测试重复模式的字符串，结果应该是去重后的最小字典序字符串。

13. **testComplexPattern**: 测试复杂的字符串，结果应该是去重后的最小字典序字符串。

14. **testEdgeCaseWithMultipleSolutions**: 测试包含多个可能解的字符串，结果应该是去重后的最小字典序字符串。

    测试全部通过如下：

![image-20241130212742298](C:\Users\WYW\AppData\Roaming\Typora\typora-user-images\image-20241130212742298.png)