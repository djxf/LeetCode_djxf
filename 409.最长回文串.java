import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        //记录下是否有单个字符的
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for(char item : s.toCharArray()){
            if(!map.containsKey(item)){
                map.put(item, 1);
            }else{
                map.put(item, map.get(item) + 1);
            }
        }
        for(Map.Entry<Character,Integer> item : map.entrySet()){
            count += item.getValue() % 2 == 0 ? item.getValue() : item.getValue()-1;
            if(item.getValue() % 2 == 1){
                flag = true;
            }
        }
        return flag ? count + 1 : count;
    }
}
// @lc code=end

