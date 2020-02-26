/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        int count = 0;
        boolean[] nums = new boolean[n];

        for (int i = 2; i * i < n; i++){
            if (!nums[i]) {
                for (int j = i * i; j < n; j += i) {
                    if (nums[j])
                        continue;
                    count++;
                    nums[j] = true;
                }
            }            
        }
        return n - count - 2;


    }
}
// @lc code=end

