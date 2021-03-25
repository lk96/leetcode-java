package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 11:22
 * @Description: 回文数
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x - reverse(x) == 0;
    }

    private static int reverse(int x) {
        int newNum = 0;
        while (x > 0) {
            newNum = newNum * 10 + x % 10;
            x /= 10;
        }
        return newNum;
    }
}
