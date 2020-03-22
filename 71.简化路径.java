import java.util.Stack;

/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
            String[] s = path.split("/");
            Stack<String> stack = new Stack<>();
            
            for(String str : s){
                if(!stack.isEmpty() && str.equals("..")){
                    stack.pop();
                }else if(!str.equals("") && ! str.equals(".") && !str.equals("..")){
                    stack.push(str);
                }
            }
            if(stack.isEmpty()){
                return "/";
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0;i < stack.size();i++){
                stringBuilder.append("/"+stack.get(i));
            }
            return stringBuilder.toString();

    }
}
// @lc code=end

