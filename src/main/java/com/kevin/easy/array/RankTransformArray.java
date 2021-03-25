package com.kevin.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @Author: kai Li
 * Date: 2021/3/23 10:29
 * @Description: 数组序号转换
 * 给你一个整数数组arr ，请你将数组中的每个元素替换为它们排序后的序号。
 * <p>
 * 序号代表了一个元素有多大。序号编号的规则如下：
 * <p>
 * 序号从 1 开始编号。
 * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
 * 每个数字的序号都应该尽可能地小。
 */
public class RankTransformArray {

    public static void main(String[] args) {
        int[] nums = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] result = arrayRankTransform(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = Arrays.stream(arr).boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (!pq.isEmpty()) {
            int key = pq.poll();
            map.put(key, rank++);
            while (!pq.isEmpty() && pq.peek() == key) {
                pq.poll();
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
