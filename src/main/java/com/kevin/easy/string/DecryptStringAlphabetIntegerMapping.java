package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/9 8:32
 * @Description: 解码字母到整数映射
 * 给你一个字符串s，它由数字（'0' - '9'）和'#'组成。我们希望按下述规则将s映射为一些小写英文字符：
 *
 * 字符（'a' - 'i'）分别用（'1' -'9'）表示。
 * 字符（'j' - 'z'）分别用（'10#'-'26#'）表示。
 * 返回映射之后形成的新字符串。
 *
 * 题目数据保证映射始终唯一。
 */
public class DecryptStringAlphabetIntegerMapping {

    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#" ));
    }

    public static String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        int idx = 0;
        int n = s.length();
        while (idx < n) {
            char c = s.charAt(idx);
            int asciiAdd = -1;
            if (idx + 2 < n && s.charAt(idx + 2) == '#') {
                asciiAdd = Integer.parseInt(s.substring(idx, idx + 2));
                idx += 3;
            }else {
                asciiAdd = Integer.parseInt(s.substring(idx, idx + 1));
                idx++;
            }
            builder.append((char) (96 + asciiAdd));
        }
        return builder.toString();
    }
}
