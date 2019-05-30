/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {

      
         char[] cneedle = needle.toCharArray();
         char[] chaystack = haystack.toCharArray();
         int i=0;
         int j=0;
         while(i < cneedle.length && j < chaystack.length){
             if(cneedle[i] == chaystack[j]){
                  i++;
                  j++;
             }else{
                 j = j -i +1;
                 i = 0;//
             }
         }
       
       //如何判断结束
       if(i == needle.length()){
           return j -i;
       }else{
           return -1;
       }
       
    }
}

