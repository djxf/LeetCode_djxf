/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        if(strs.length < 1 || strs == null){
            return "";
        }

        //find the shortest string
        String position = strs[0];
        int num = 0;
        for (int i=0;i<strs.length;i++){
                if(strs[i].length() < position.length()){
                    position = strs[i];
                    num = i;
                }
        }

        //find the longest common prefix
        String short_str = strs[0];
        for (String str : strs) {
            while(str.indexOf(short_str)!=0){
                short_str = short_str.substring(0,short_str.length()-1);
            }
        }
        return short_str;
    }
}

