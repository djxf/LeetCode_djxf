/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        
        //巧妙
        int count =0;
        while(n > 0){
            count += n/5;
            n = n/5;
        }
        return count;
    // //溢出超过最大整数
    // public int factorial(int n){
    //     if(n <= 1){
    //         return 1;
    //     }
    //     return factorial(n-1)*n;
    // }
}
}
// @lc code=end

