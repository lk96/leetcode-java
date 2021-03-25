package com.kevin.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kai Li
 * Date: 2021/3/18 16:37
 * @Description: 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 */
public class PascalTriangleTwo {

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        List<Integer> prev;
        for (int i = 0; i <= rowIndex; i++) {
            prev = result;
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(prev.get(j - 1) + prev.get(j));
                }
            }
            result = temp;
        }
        return result;
    }
}
