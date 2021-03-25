package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/18 9:56
 * @Description: x 的平方根
 */
public class SqrtX {

    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int start = 2;
        int end = x / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long num = (long) mid * mid;
            if (num > x) {
                end = mid - 1;
            } else if (num < x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
