package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/14 15:02
 * @Description: 字符串的最大公因子
 *
 * 对于字符串S 和T，只有在 S = T + ... + T（T 自身连接 1 次或多次）时，我们才认定“T 能除尽 S”。
 *
 * 返回最长字符串X，要求满足X 能除尽 str1 且X 能除尽 str2。
 *
 * 示例 1：
 *
 * 输入：str1 = "ABCABC", str2 = "ABC"
 * 输出："ABC"
 */
public class GreatestCommonDivisorStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        return stringGcd(str1, str2);
    }

    public static String stringGcd(String str1, String str2) {
        if (str1.length() == 0) {
            return str2;
        }

        if (str2.length() == 0) {
            return str1;
        }

        if (str1.equals(str2)) {
            return str1;
        }

        if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return "";
                }
            }
            String temp = str1.substring(str2.length());
            return gcdOfStrings(temp, str2);
        }

        if (str2.length() > str1.length()) {
            return stringGcd(str2, str1);
        }
        return "";
    }
}
