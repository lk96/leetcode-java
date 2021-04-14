package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 15:20
 * @Description: 判断字符串的两半是否相似
 * 给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。
 * <p>
 * 两个字符串 相似 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * <p>
 * 如果 a 和 b 相似，返回 true ；否则，返回 false 。
 */
public class DetermineStringHalvesAlike {

    private static final String VOWELS = "aeiouAEIOU";

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        return getVowelCount(s.substring(0, s.length() / 2)).equals(getVowelCount(s.substring(s.length() / 2)));
    }

    private static Long getVowelCount(String s) {
        return s.chars().mapToObj(c -> (char) c).filter(c -> VOWELS.indexOf(c) != -1).count();
    }
}
