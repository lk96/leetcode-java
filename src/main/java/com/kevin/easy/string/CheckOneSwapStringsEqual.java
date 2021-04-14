package com.kevin.easy.string;

/**
 * @Author: kai Li
 * Date: 2021/4/8 16:53
 * @Description: 仅执行一次字符串交换能否使两个字符串相等
 * 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
 * <p>
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 */
public class CheckOneSwapStringsEqual {

    public static int UNSET_INDEX = -1;
    public static int SET_INDEX = 101;

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("abcd", "dcba" ));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int swapIndex = UNSET_INDEX;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (swapIndex == SET_INDEX) {
                    return false;
                } else if (swapIndex == UNSET_INDEX) {
                    swapIndex = i;
                } else {
                    if (!(s1.charAt(swapIndex) == s2.charAt(i) && s1.charAt(i) == s2.charAt(swapIndex))) {
                        return false;
                    }
                    swapIndex = SET_INDEX;
                }
            }
        }
        return swapIndex == UNSET_INDEX || swapIndex == SET_INDEX;
    }
}
