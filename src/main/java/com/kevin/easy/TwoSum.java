package com.kevin.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: kai Li
 * Date: 2021/3/17 10:33
 * @Description: 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
