package com.kevin.easy.string;

import java.util.Arrays;

/**
 * @Author: kai Li
 * Date: 2021/4/8 16:09
 * @Description: 检查两个字符串数组是否相等
 * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 * <p>
 * 数组表示的字符串是由数组中的所有元素 按顺序 连接形成的字符串。
 */
public class CheckTwoStringArraysEqual {

    public static void main(String[] args) {
        String[] str1 = {"ab", "c"};
        String[] str2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(str1, str2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Arrays.stream(word1).reduce((a, b) -> a + b).equals(Arrays.stream(word2).reduce((a, b) -> a + b));
    }
}
