package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/9 8:41
 * @Description: 检测大写字母
 *
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写，比如"Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 */
public class DetectCapital {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG" ));
    }

    public static boolean detectCapitalUse(String word) {
        int length = word.length();
        if (length == 0) {
            return true;
        }
        boolean firstCaps = Character.isUpperCase(word.charAt(0));
        for (int i = 1; i < length; i++) {
            if (firstCaps) {
                if (Character.isUpperCase(word.charAt(1)) && !Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
                if (!Character.isUpperCase(word.charAt(1)) && Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }else {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
