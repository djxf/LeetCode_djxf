import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
            // List<List<Integer>> output = new ArrayList<>();
            // output.add(new ArrayList<Integer>());
            
            // //遍历数组
            // for(int num : nums){
            //     List<List<Integer>> newSubset = new ArrayList<>();
            //     //遍历每个output集加入一个数之后再加入output集合里面
            //     for(List<Integer> curr : output){
            //         newSubset.add(new ArrayList<Integer>(curr){
            //             {add(num);}
            //         });
            //     }

            //     for(List<Integer> curr : newSubset){
            //         output.add(curr);
            //     }
            // }
            // return output;

            // 2 回溯算法        
            // for(int k = 0;k <= nums.length;k++){
            //     backTrace(0, k, new ArrayList<>(),nums);
            // }
            // return output;
            int nthBit = 1 << nums.length;
            int n = nums.length;
        for(int i = 1;i <= Math.pow(2, n);i++){
            String bitmask = Integer.toBinaryString(i | nthBit).substring(1);
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j < n;j++){
                if(bitmask.charAt(j) == '1'){
                    list.add(nums[j]);
                }
            }
            output.add(list);
        }
        return output;

    }


    //回溯法是一种探索所有潜在可能性找到解决方案的算法。
    //如果当前方案不是正确的解决方案，或者不是最后一个解决方案，则修改上一步的值继续寻找解决方案。
    //@param int 
    //@param int k 要生成的子集的元素的个数
    //@param List<Integer> curr 
    //@param int[] nums 给定的数组
    public void backTrace(int first,int k,ArrayList<Integer> curr,int[] nums){
        //子集已经构造完成
        if(k == curr.size()){
            output.add(new ArrayList<>(curr));
        }
        for(int i = first;i < nums.length;i++){
            //做选择
            curr.add(nums[i]);
            backTrace(i+1, k, curr, nums);
            //撤销选择
            curr.remove(curr.size() - 1);
        }
    }
}
// @lc code=end

