package com.kevin.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kai Li
 * Date: 2021/3/23 10:15
 * @Description: 较大分组的位置
 * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
 * <p>
 * 例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * <p>
 * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
 * <p>
 * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
 * <p>
 * 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
 */
public class PositionsLargeGroups {

    public static void main(String[] args) {
        List<List<Integer>> result = largeGroupPositions("abcdddeeeeaabbbcd");
        System.out.println("result = " + result);
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> positions = new ArrayList<>();
        int i = 1;
        int count = 1;
        int start = 0;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count >= 3) {
                    List<Integer> temp = Arrays.asList(start, i - 1);
                    positions.add(temp);
                }
                start = i;
                count = 1;
            }
            i++;
        }
        if (count >= 3) {
            positions.add(Arrays.asList(start, i - 1));
        }
        return positions;
    }
}
