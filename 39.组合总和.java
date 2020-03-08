import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        return dfs(results, result, candidates, target, 0);
    }


    //回溯法 深度优先搜索 DFS
    public List<List<Integer>> dfs(List<List<Integer>> results, List<Integer> result, int[] candidates, int target,
            int level) {
        //递归终止条件
        if(target == 0){
            results.add(result);
            return results;
        }
        
        //搜索
        for(int i = level;i < candidates.length && target - candidates[i] >= 0;i++){
            result.add(candidates[i]);//把第i+1 个加入数组
            dfs(results, result, candidates, target - candidates[i], i);
           
        }
        return results;
    }
}
// @lc code=end

