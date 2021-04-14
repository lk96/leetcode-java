package com.kevin.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kai Li
 * Date: 2021/4/12 16:43
 * @Description: 两个相同字符之间的最长子字符串
 *
 * 给你一个字符串 s，请你返回 两个相同字符之间的最长子字符串的长度 ，计算长度时不含这两个字符。如果不存在这样的子字符串，返回 -1 。
 *
 * 子字符串 是字符串中的一个连续字符序列。
 *
 * 示例 1：
 *
 * 输入：s = "aa"
 * 输出：0
 * 解释：最优的子字符串是两个 'a' 之间的空子字符串。
 */
public class LargestSubstringTwoEqualCharacters {

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("cabbac"));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> startIndex = new HashMap<>();
        int largestSubstringLength = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            startIndex.putIfAbsent(c, i);
            largestSubstringLength = Math.max(largestSubstringLength, i - startIndex.get(c) - 1);
        }
        return largestSubstringLength;
    }
}
