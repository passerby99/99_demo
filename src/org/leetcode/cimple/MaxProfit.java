package org.leetcode.cimple;

import org.junit.Test;

// 买卖票的最佳时期
public class MaxProfit {
    private int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;

        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(prices[i] - min, max);
            }
        }
        return max;
    }
    @Test
    public void test() {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
