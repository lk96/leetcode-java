package com.kevin.easy.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: kai Li
 * Date: 2021/3/18 19:37
 * @Description: 单行键盘
 * 我们定制了一款特殊的力扣键盘，所有的键都排列在一行上。
 * <p>
 * 我们可以按从左到右的顺序，用一个长度为 26 的字符串 keyboard （索引从 0 开始，到 25 结束）来表示该键盘的键位布局。
 * <p>
 * 现在需要测试这个键盘是否能够有效工作，那么我们就需要个机械手来测试这个键盘。
 * <p>
 * 最初的时候，机械手位于左边起第一个键（也就是索引为 0 的键）的上方。当机械手移动到某一字符所在的键位时，就会在终端上输出该字符。
 * <p>
 * 机械手从索引 i 移动到索引 j 所需要的时间是 |i - j|。
 * <p>
 * 当前测试需要你使用机械手输出指定的单词 word，请你编写一个函数来计算机械手输出该单词所需的时间。
 */
public class KeyboardRow {

    public static void main(String[] args) {

    }

    public static String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        update(map, "qwertyuiop", 1);
        update(map, "asdfghjkl", 2);
        update(map, "zxcvbnm", 3);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int rowIdx = -1;
            for (char c : words[i].toCharArray()) {
                if (rowIdx == -1) {
                    rowIdx = map.get(Character.toLowerCase(c));
                }
                if (map.get(Character.toLowerCase(c)) != rowIdx) {
                    rowIdx = -1;
                    break;
                }
            }
            if (rowIdx != -1) {
                list.add(i);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = words[list.get(i)];
        }
        return result;
    }

    private static void update(HashMap<Character, Integer> map, String s, int row) {
        for (char c : s.toCharArray()) {
            map.put(c, row);
        }
    }
}
