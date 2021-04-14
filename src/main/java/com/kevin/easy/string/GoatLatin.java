package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/14 14:58
 * @Description: 山羊拉丁文
 *
 * 给定一个由空格分割单词的句子S。每个单词只包含大写或小写字母。
 *
 * 我们要将句子转换为“Goat Latin”（一种类似于 猪拉丁文- Pig Latin 的虚构语言）。
 *
 * 山羊拉丁文的规则如下：
 *
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 * 例如，单词"apple"变为"applema"。
 *
 * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词"goat"变为"oatgma"。
 *
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 * 返回将S转换为山羊拉丁文后的句子。
 *
 * 示例 1:
 *
 * 输入: "I speak Goat Latin"
 * 输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 */
public class GoatLatin {

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        StringBuilder endAppend = new StringBuilder("a");
        final String CONSTANT_APPEND = "ma";
        int start = 0;
        int end = 0;
        int n = S.length();
        while (end < n) {
            while (end < n && S.charAt(end) != ' ') {
                end++;
            }
            char c = Character.toLowerCase(S.charAt(start));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(S.substring(start, end)).append(CONSTANT_APPEND).append(endAppend.toString());
            }
            else {
                sb.append(S.substring(start + 1, end)).append(S.charAt(start)).append(CONSTANT_APPEND).append(endAppend.toString());
            }
            endAppend.append('a');
            end++;
            start = end;
            if (end < n) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
