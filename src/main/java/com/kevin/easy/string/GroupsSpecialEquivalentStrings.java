package com.kevin.easy.string;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: kai Li
 * Date: 2021/4/14 15:08
 * @Description: 特殊等价字符串组
 * <p>
 * 你将得到一个字符串数组 A。
 * <p>
 * 每次移动都可以交换 S 的任意两个偶数下标的字符或任意两个奇数下标的字符。
 * <p>
 * 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是 特殊等价 的。
 * <p>
 * 例如，S = "zzxy" 和 T = "xyzz" 是一对特殊等价字符串，因为可以先交换 S[0] 和 S[2]，然后交换 S[1] 和 S[3]，使得 "zzxy" -> "xzzy" -> "xyzz" 。
 * <p>
 * 现在规定，A 的 一组特殊等价字符串 就是 A 的一个同时满足下述条件的非空子集：
 * <p>
 * 该组中的每一对字符串都是 特殊等价 的
 * 该组字符串已经涵盖了该类别中的所有特殊等价字符串，容量达到理论上的最大值（也就是说，如果一个字符串不在该组中，那么这个字符串就 不会 与该组内任何字符串特殊等价）
 * 返回 A中特殊等价字符串组的数量。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
 * 输出：3
 * 解释：
 * 其中一组为 ["abcd", "cdab", "cbad"]，因为它们是成对的特殊等价字符串，且没有其他字符串与这些字符串特殊等价。
 * 另外两组分别是 ["xyzz", "zzxy"] 和 ["zzyx"]。特别需要注意的是，"zzxy" 不与 "zzyx" 特殊等价。
 */
public class GroupsSpecialEquivalentStrings {

    public static void main(String[] args) {
        System.out.println(numSpecialEquivGroups(new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"}));
    }

    public static int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        for (String s : A) {
            int[] even = new int[26];
            int[] odd = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even[s.charAt(i) - 'a']++;
                } else {
                    odd[s.charAt(i) - 'a']++;
                }
            }
            set.add(Arrays.toString(even) + "|" + Arrays.toString(odd));
        }
        return set.size();
    }
}
