import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
            if(n < 1){
                return list;
            }
            backTracing(n, "");
            return list;
    }

    //@param n 生成括号的对数
    //@param strs 已生成的字符串
    public void backTracing(int n,String strs){
        if(strs.length() == n * 2 && isValid(strs,n)){
            list.add(strs);
            return;
        }
        if(isValid(strs,n)){
            backTracing(n, strs+'(');
        }
        if(isValid(strs,n)){
            backTracing(n, strs+')');
        }
        return;
    }

    //判断是否有效括号组合
    private boolean isValid(String strs,int n) {
        int count = 0;
        for(char item : strs.toCharArray()){
            if(item == '('){
                count++;
            }else if(item == ')'){
                count--;
                if(count < 0){
                    return false;
                }
            }
        }
        return strs.length() < n * 2 || count == 0;
    }
}
// @lc code=end

