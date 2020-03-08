/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // int result = 0;
        // for(int i = 0;i < height.length-1;i++){
        //     for(int j = i + 1;j < height.length;j++){
        //         int temp = (j - i)*Math.min(height[i], height[j]);
        //         if(temp > result){
        //             result = temp;
        //         }
        //     }
        // }
        // return result;

        int result = 0;
        int k = 0;
        int l = height.length - 1;
        while(k < l){
            result = Math.max(result, Math.min(height[k], height[l])*(l - k));
            if(height[k] < height[l]){
                k++;
            }else{
                l--;
            }
        }
        return result;
    }


}
// @lc code=end

