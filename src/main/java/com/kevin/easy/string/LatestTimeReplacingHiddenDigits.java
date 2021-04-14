package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 16:33
 * @Description: 替换隐藏数字得到的最晚时间
 * 给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。
 *
 * 有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。
 *
 * 替换time 中隐藏的数字，返回你可以得到的最晚有效时间。
 *
 *
 *
 * 示例 1：
 *
 * 输入：time = "2?:?0"
 * 输出："23:50"
 * 解释：以数字 '2' 开头的最晚一小时是 23 ，以 '0' 结尾的最晚一分钟是 50 。
 */
public class LatestTimeReplacingHiddenDigits {

    public static void main(String[] args) {
        System.out.println(maximumTime("2?:?0"));
    }

    public static String maximumTime(String time) {
        char[] digits = time.toCharArray();
        if (digits[0] == '?' || digits[1] == '?') {
            if (digits[0] == '?') {
                if (digits[1] == '?' || Character.getNumericValue(digits[1]) <= 3) {
                    digits[0] = '2';
                }else {
                    digits[0] = '1';
                }
            }
            if (digits[1] == '?') {
                if (Character.getNumericValue(digits[0]) <= 1) {
                    digits[1] = '9';
                }else {
                    digits[1] = '3';
                }
            }
        }
        if (digits[3] == '?' || digits[4] == '?') {
            if (digits[3] == '?') {
                digits[3] = '5';
            }
            if (digits[4] == '?') {
                digits[4] = '9';
            }
        }
        return String.valueOf(digits);
    }
}
