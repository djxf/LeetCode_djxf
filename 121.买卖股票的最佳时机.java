/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0){
            return 0;
        }
        //除去暴力解法
        //优化 只关注之前的最小值 关注现在收益的最大值
        int maxPro = 0;
        int minPrice = prices[0];
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro,prices[i]-minPrice);
        }
        return maxPro;
    }
}
// @lc code=end

