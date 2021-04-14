package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 15:26
 * @Description: 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 示例：
 * <p>
 * s = "leetcode"
 * 返回 0
 * <p>
 * s = "loveleetcode"
 * 返回 2
 */
public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            if (arr[c - 'a'] != 0) {
                arr[c - 'a'] = -1;
            } else {
                arr[c - 'a'] = 1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
