package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/12 15:32
 * @Description: 生成每种字符都是奇数个的字符串
 * <p>
 * 给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
 * <p>
 * 返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 4
 * 输出："pppz"
 * 解释："pppz" 是一个满足题目要求的字符串，因为 'p' 出现 3 次，且 'z' 出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ohhh" 和 "love"。
 */
public class GenerateStringCharactersOddCounts {

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
    }

    public static String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        if (n % 2 == 0) {
            builder.append('a');
            for (int i = 0; i < n - 1; i++) {
                builder.append('b');
            }
        } else {
            for (int i = 0; i < n; i++) {
                builder.append('a');
            }
        }
        return builder.toString();
    }
}
