package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/17 15:56
 * @Description:
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currSum += num;
            if (num > currSum) {
                currSum = num;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
