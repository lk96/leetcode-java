package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 15:16
 * @Description: 实现 strStr()
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        int idx = 0;
        while (idx + needleLength < haystackLength) {
            if (haystack.substring(idx, idx + needleLength).equals(needle)) {
                return idx;
            }
            idx++;
        }
        return -1;
    }
}
