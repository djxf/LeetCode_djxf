import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int i = 0,j = 0;
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j -i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;






    //2 暴力算法 时间会超出限制
    //     int n = s.length();
    //     int ans = 0;
    //     for(int i =0;i < n;i++){
    //         for(int j = i+1;j <= n;j++){
    //             if(allUnique(s, i, j)){
    //                 ans = Math.max(ans, j - i);
    //             }
    //         }
    //     }
    //     return ans;
           
    // }

    // public boolean allUnique(String s, int start, int end){
    //     Set<Character> set = new HashSet<>();
    //     for(int i = start; i < end; i++){
    //         Character ch = s.charAt(i);
    //         if((set.contains(ch))) return false;
    //         set.add(ch);
    //     }
    //     return true;

    // }
    }
}
// @lc code=end

