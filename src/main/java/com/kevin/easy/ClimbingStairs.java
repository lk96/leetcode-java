package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/18 10:09
 * @Description: 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(3));
    }

    int[] memo;

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        return helper(n);
    }

    private int helper(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = helper(n - 1) + helper(n - 2);
        return memo[n];
    }
}
