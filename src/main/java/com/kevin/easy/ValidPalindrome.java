package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/18 17:03
 * @Description: 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))) {
                char c1 = Character.isLetter(s.charAt(start)) ? Character.toLowerCase(s.charAt(start)) :
                        s.charAt(start);
                char c2 = Character.isLetter(s.charAt(end)) ? Character.toLowerCase(s.charAt(end)) : s.charAt(end);
                if (c1 != c2) {
                    return false;
                }
                start++;
                end--;
            } else {
                if (!Character.isLetterOrDigit(s.charAt(start))) {
                    start++;
                }
                if (!Character.isLetterOrDigit(s.charAt(end))) {
                    end--;
                }
            }
        }
        return true;
    }
}
