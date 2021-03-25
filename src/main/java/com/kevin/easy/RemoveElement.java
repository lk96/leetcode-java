package com.kevin.easy;

import java.util.Arrays;

/**
 * @Author: kai Li
 * Date: 2021/3/17 15:11
 * @Description: 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        while (end < n) {
            if (nums[end] != val) {
                nums[start++] = nums[end];
            }
            end++;
        }
        return start;
    }
}
