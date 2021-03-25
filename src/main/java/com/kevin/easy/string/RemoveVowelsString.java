package com.kevin.easy.string;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: kai Li
 * Date: 2021/3/18 19:15
 * @Description: 删去字符串中的元音
 * 给你一个字符串 S，请你删去其中的所有元音字母（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
 */
public class RemoveVowelsString {

    public static void main(String[] args) {
        String result = removeVowels("leetcodeisacommunityforcoders");
        System.out.println(result.equals("ltcdscmmntyfrcdrs"));
    }

    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char c : s.toCharArray()) {
            if (!vowels.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
