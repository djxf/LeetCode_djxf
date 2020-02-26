import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mpa1 = new HashMap<>();
        Map<Character,Character> mpa2 = new HashMap<>();
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        int length = cs.length;
        for(int i = 0;i < length;i++){
            if(!mpa1.containsKey(ts[i])){
                mpa1.put(ts[i], cs[i]);
            }
            if(!mpa2.containsKey(cs[i])){
                mpa2.put(cs[i],ts[i]);
            }
            if(mpa1.get(ts[i]) != cs[i] || mpa2.get(cs[i]) != ts[i]){
                return false;
            }
        }
        return true;

    }
}
// @lc code=end

