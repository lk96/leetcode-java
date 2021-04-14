package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/8 17:16
 * @Description: 计数二进制子串
 * 给定一个字符串s，计算具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是连续的。
 *
 * 重复出现的子串要计算它们出现的次数。
 */
public class CountBinarySubstrings {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("10101" ));
    }

    public static int countBinarySubstrings(String s) {
        int currentValueCount = 1;
        int prevValueCount = 0;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentValueCount++;
            }else {
                prevValueCount = currentValueCount;
                currentValueCount = 1;
            }
            if (prevValueCount >= currentValueCount) {
                count++;
            }
        }
        return count;
    }
}
