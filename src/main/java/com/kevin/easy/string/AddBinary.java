package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/3/17 16:26
 * @Description: 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int idxA = a.length() - 1;
        int idxB = b.length() - 1;
        while (idxA >= 0 || idxB >= 0 || carry > 0) {
            int temp = (
                    (idxA >= 0 ? Character.getNumericValue(a.charAt(idxA--)) : 0) +
                            (idxB >= 0 ? Character.getNumericValue(b.charAt(idxB--)) : 0) +
                            carry
            );
            carry = temp > 1 ? 1 : 0;
            temp = temp > 1 ? (temp == 2 ? 0 : 1) : temp;
            sb.append(temp);
        }
        return sb.reverse().toString();
    }
}
