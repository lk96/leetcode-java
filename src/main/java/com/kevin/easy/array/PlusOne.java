package com.kevin.easy.array;

import java.util.Arrays;

/**
 * @Author: kai Li
 * Date: 2021/3/17 16:11
 * @Description: 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            int temp = digits[i] + carry;
            if (temp <= 9) {
                digits[i] = temp;
                return digits;
            }
            digits[i] = temp % 10;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            newDigits[i] = digits[i - 1];
        }
        return newDigits;
    }
}
