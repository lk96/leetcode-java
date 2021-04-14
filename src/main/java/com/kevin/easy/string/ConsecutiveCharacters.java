package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/8 17:00
 * @Description: 连续字符
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 *
 * 请你返回字符串的能量。
 *
 */
public class ConsecutiveCharacters {

    public static void main(String[] args) {
        System.out.println(maxPower("abbcccddddeeeeedcba" ));
    }

    public static int maxPower(String s) {
        int maximumRepeatingCount = 0;
        for (int idx = 0; idx < s.length();) {
            char currentChar = s.charAt(idx);
            int currentIdx = idx;
            while (idx < s.length() && s.charAt(idx) == currentChar) {
                idx++;
            }
            maximumRepeatingCount = Math.max(maximumRepeatingCount, idx - currentIdx);
        }
        return maximumRepeatingCount;
    }
}
