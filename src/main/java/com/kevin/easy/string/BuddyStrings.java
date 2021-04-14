package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/8 15:51
 * @Description: 亲密字符串
 * 给定两个由小写字母构成的字符串A和B，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回true；否则返回 false 。
 * <p>
 * 交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 */
public class BuddyStrings {

    public static void main(String[] args) {
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb" ));
    }

    public static boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char requireChar = '-';
        char mismatchChar = '-';
        int[] counter = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (requireChar == '_') {
                    return false;
                }
                if (requireChar == '-') {
                    requireChar = b.charAt(i);
                    mismatchChar = a.charAt(i);
                } else {
                    if (b.charAt(i) == mismatchChar && a.charAt(i) == requireChar) {
                        requireChar = '_';
                    } else {
                        return false;
                    }
                }
            } else {
                counter[a.charAt(i) - 'a']++;
            }
        }
        if (mismatchChar != '-') {
            return requireChar == '_';
        }
        for (int i = 0; i < 26; i++) {
            if (counter[i] > 1) {
                return true;
            }
        }
        return false;
    }
}
