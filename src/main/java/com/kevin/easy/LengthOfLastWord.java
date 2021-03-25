package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 16:04
 * @Description: 最后一个单词的长度
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World 111 "));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        int idx = s.length() - 1;
        while (idx >= 0 && s.charAt(idx) == ' ') {
            idx--;
        }
        while (idx >= 0 && s.charAt(idx) != ' ') {
            idx--;
            count++;
        }
        return count;
    }
}
