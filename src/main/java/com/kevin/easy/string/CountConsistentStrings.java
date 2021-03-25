package com.kevin.easy.string;

import java.util.Arrays;

/**
 * @Author: kai Li
 * Date: 2021/3/18 19:48
 * @Description: 统计一致字符串的数目
 * 给你一个由不同字符组成的字符串allowed和一个字符串数组words。如果一个字符串的每一个字符都在 allowed中，就称这个字符串是 一致字符串 。
 * <p>
 * 请你返回words数组中一致字符串 的数目。
 */
public class CountConsistentStrings {

    public static void main(String[] args) {
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings("ab", words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        return (int) Arrays.stream(words).filter(
                word -> word.chars().mapToObj(c -> (char) c)
                        .allMatch(c -> allowed.indexOf(c) != -1)
        ).count();
    }
}
