package com.kevin.easy.string;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: kai Li
 * Date: 2021/4/12 16:17
 * @Description: 最长的美好子字符串
 * 当一个字符串 s包含的每一种字母的大写和小写形式 同时出现在 s中，就称这个字符串s是 美好 字符串。比方说，"abABB"是美好字符串，因为'A' 和'a'同时出现了，且'B'
 * 和'b'也同时出现了。然而，"abA"不是美好字符串因为'b'出现了，而'B'没有出现。
 *
 * 给你一个字符串s，请你返回s最长的美好子字符串。如果有多个答案，请你返回最早出现的一个。如果不存在美好子字符串，请你返回一个空字符串。
 *
 * 示例 1：
 *
 * 输入：s = "YazaAay"
 * 输出："aAa"
 * 解释："aAa" 是一个美好字符串，因为这个子串中仅含一种字母，其小写形式 'a' 和大写形式 'A' 也同时出现了。
 * "aAa" 是最长的美好子字符串。
 */
public class LongestNiceSubstring {

    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));
    }

    public static String longestNiceSubstring(String s) {
        Set<Character> set = s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c)))) {
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }
        return s;
    }
}
