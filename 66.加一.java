/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else{
                digits[i] = 0;
            }
        }

        //加1后对首位为0进行处理
        if(digits[0] == 0){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
}
}
