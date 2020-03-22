import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n <= 0 || k <= 0) return list;
        List<Integer> trace = new ArrayList<>();
        backTrace(n, k, 1, trace);
        return list;
    }

    public void backTrace(int n,int k,int start,List<Integer> trace){
            if(k == trace.size()){
                list.add(new ArrayList<>(trace));
                return;
            }

            for(int i = start;i <= n;i++){
                trace.add(i);
                backTrace(n, k, i+1, trace);
                trace.remove(trace.size() - 1);
            }
    }

}
// @lc code=end

