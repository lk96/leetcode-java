package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 15:03
 * @Description: 删除有序数组中的重复项
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        while (end < n) {
            int curr = nums[end];
            while (end < n && nums[end] == curr) {
                end++;
            }
            nums[start++] = curr;
        }
        return start;
    }
}
