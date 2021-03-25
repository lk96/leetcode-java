package com.kevin.easy;

import java.util.Arrays;

/**
 * @Author: kai Li
 * Date: 2021/3/18 10:24
 * @Description: 合并两个有序数组
 * 给你两个有序整数数组nums1 和 nums2，请你将 nums2 合并到nums1中，使 nums1 成为一个有序数组。
 * <p>
 * 初始化nums1 和 nums2 的元素数量分别为m 和 n 。你可以假设nums1 的空间大小等于m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1;
        int nums1Idx = m - 1;
        int nums2Idx = n - 1;
        while (nums1Idx >= 0 || nums2Idx >= 0) {
            int val;
            if (nums1Idx >= 0 && nums2Idx >= 0) {
                if (nums1[nums1Idx] > nums2[nums2Idx]) {
                    val = nums1[nums1Idx--];
                } else {
                    val = nums2[nums2Idx--];
                }
            } else if (nums1Idx >= 0) {
                val = nums1[nums1Idx--];
            } else {
                val = nums2[nums2Idx--];
            }
            nums1[idx--] = val;
        }
    }
}
