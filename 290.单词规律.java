import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
            String[] strs = str.split(" ");
            char[] cs = pattern.toCharArray();
            if(pattern.length() != strs.length){
                return false;
            }
            Map<Character,String> map = new HashMap<>();
            for(int i = 0;i < cs.length;i++){
                if(map.containsKey(cs[i])){
                    if(!map.get(cs[i]).equals(strs[i])){
                        return false;
                    }
                }else{
                    map.put(cs[i], strs[i]);
                }
            }
            Map<String,Character> map2 = new HashMap<>();
            for(int i = 0;i < cs.length;i++){
                if(map2.containsKey(strs[i])){
                    if(map2.get(strs[i]) != cs[i]){
                        return false;
                    }
                }else{
                    map2.put(strs[i], cs[i]);
                }
            }

            return true;
    }
}
// @lc code=end

