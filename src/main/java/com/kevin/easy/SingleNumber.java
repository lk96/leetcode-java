package com.kevin.easy;

import java.util.Arrays;

/**
 * @Author: kai Li
 * Date: 2021/3/18 17:14
 * @Description: 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 6, 8, 1, 2, 4, 6};
        System.out.println(singleNumber2(nums));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        boolean twice = true;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (twice) {
                    twice = false;
                } else {
                    return nums[i];
                }
            } else {
                twice = true;
            }
        }
        return nums[nums.length - 1];
    }

    public static int singleNumber2(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
