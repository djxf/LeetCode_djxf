import javax.lang.model.element.Element;

/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
            if(nums == null || nums.length == 0){
                return;
            }
            int p0 = 0;
            int curr = 0;
            int p2 = nums.length - 1;
            while(curr <= p2){

                //如果碰到0 当前位置和p0的最右边界进行交换
                if(nums[curr] == 0){
                    int temp = nums[p0];
                    nums[p0] = nums[curr];
                    nums[curr] = temp;
                    p0++;
                    curr++;
                }else if(nums[curr] == 2){
                    int temp = nums[p2];
                    nums[p2] = nums[curr];
                    nums[curr] = temp;
                    p2--;
                }else{
                    curr++;
                }
                
            }

    }
}
// @lc code=end

