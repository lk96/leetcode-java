package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 10:47
 * @Description: 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围[−231,  231 − 1] ，就返回 0。
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(100));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            //注意为了避免溢出 每次记录old和new 然后用相反的方法：
            //result = (newResult - tail) / 10，判断old和new是否相等，若前后不相等，说明溢出
            //当tail为负的时候就应该是(newResult - tail) > result
            // 为正应该是(newResult - tail)）/10 < result
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
