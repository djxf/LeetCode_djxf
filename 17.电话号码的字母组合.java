import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    List<String> list = new ArrayList<>();

    Map<String, String> phone = new HashMap<String, String>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
      }};




    public List<String> letterCombinations(String digits) {
            if(digits.length() != 0){
                backTracing("",digits);
            }
            return list;
    }

    private void backTracing(String combin, String digits) {
        
        if(digits.length() == 0){
            list.add(combin);
            return;
        }


        String digit = digits.substring(0, 1);
        String letters = phone.get(digit);

        //循环
        for(int i = 0;i < letters.length();i++){
            String m = letters.substring(i, i+1);
            backTracing(combin + m, digits.substring(1));
        }

    }
}
// @lc code=end

