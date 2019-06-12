/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
class Solution {
    public int climbStairs(int n) {
        // f(n) = f(n-1) + f(n-2) 递归不通过 时间超出限制
        // a = 1 b = 2 i=3
        if(n <= 2)
            return n;
        int a = 1,b = 2;
        int i = 3;
        while(i < n){
            i++;
            int temp = b;     //临时变量记录b 以防丢失
            b = a + b;
            a = temp;
            
        }
        return a + b;
    }
}

