/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */
class Solution {
    public boolean isPalindrome(int x) {

        if(x==0){
            return true;
        }
        if(x < 0 || x % 10 == 0 ){
            return false;
        }
        int x1 = x;
        int r = 0;
        while(x!=0){
            r = r*10 + x%10;
            x /=10;
        }
        if(r== x1){
            return true;
        }else{
            return false;
        }
    }
}

