package com.kevin.easy;

/**
 * @Author: kai Li
 * Date: 2021/3/18 16:54
 * @Description: 买卖股票的最佳时机 II
 * 给定一个数组，它的第i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class BestTimeBuySellStockTwo {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > currMin) {
                maxProfit += prices[i] - currMin;
            }
            currMin = prices[i];
        }
        return maxProfit;
    }
}
