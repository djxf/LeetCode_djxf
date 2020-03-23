import sun.security.util.Length;

/*
 * @lc app=leetcode.cn id=410 lang=java
 *
 * [410] 分割数组的最大值
 */

// @lc code=start
class Solution {
    public int splitArray(int[] nums, int m) {
            int n = nums.length;
            //动态规划dp
            int[][] f = new int[n+1][m+1];

            int[] sub = new int[n+1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    f[i][j] = Integer.MAX_VALUE;
                }
            }
            
            for(int i = 0;i < n;i++){
                sub[i +1 ] = sub[i] + nums[i];
            }

            f[0][0] = 0;
            

    }
}
// @lc code=end

