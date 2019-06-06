/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */
class Solution {
    public int mySqrt(int x) {
        int result = 0;
        while(result * result < x ){
            result++;
        }
        return result;
    }
}

