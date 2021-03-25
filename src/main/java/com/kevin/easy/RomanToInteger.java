package com.kevin.easy;

import java.util.HashMap;

/**
 * @Author: kai Li
 * Date: 2021/3/17 12:00
 * @Description: 罗马数字转整数
 * 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X + II 。 27 写做XXVII, 即为XX+V+II。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9
 * 表示为IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        String[] keys = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        HashMap<String, Integer> map = new HashMap<>(32);
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        int val = 0;
        int idx = 0;
        int n = s.length();
        while (idx < n) {
            char c = s.charAt(idx);
            if (idx + 1 < n && map.containsKey(s.substring(idx, idx + 2))) {
                val += map.get(s.substring(idx, idx + 2));
                idx += 2;
            } else {
                val += map.get(String.valueOf(c));
                idx++;
            }
        }
        return val;
    }
}
