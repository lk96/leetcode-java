package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/3/19 9:19
 * @Description: 字符串相加
 * 给定两个字符串形式的非负整数num1 和num2，计算它们的和。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * num1 和num2的长度都小于 5100
 * num1 和num2 都只包含数字0-9
 * num1 和num2 都不包含任何前导零
 * 你不能使用任何內建 BigInteger 库，也不能直接将输入的字符串转换为整数形式
 */
public class AddStrings {

    public static void main(String[] args) {
        System.out.println(addStrings("987", "1237"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int idx1 = num1.length() - 1;
        int idx2 = num2.length() - 1;
        int carry = 0;
        while (idx1 >= 0 || idx2 >= 0) {
            int temp = carry;
            if (idx1 >= 0 && idx2 >= 0) {
                temp += Character.getNumericValue(num1.charAt(idx1--)) + Character.getNumericValue(num2.charAt(idx2--));
            } else if (idx1 >= 0) {
                temp += Character.getNumericValue(num1.charAt(idx1--));
            } else {
                temp += Character.getNumericValue(num2.charAt(idx2--));
            }
            carry = temp > 9 ? 1 : 0;
            temp = temp > 9 ? temp % 10 : temp;
            sb.append(temp);
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
