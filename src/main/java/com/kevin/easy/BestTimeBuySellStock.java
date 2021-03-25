package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/18 16:47
 * @Description: 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 * <p>
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class BestTimeBuySellStock {

    public static void main(String[] args) {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price > currMin) {
                maxProfit = Math.max(maxProfit, price - currMin);
            } else {
                currMin = price;
            }
        }
        return maxProfit;
    }
}
