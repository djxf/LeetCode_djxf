/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */
class Solution {
    public String countAndSay(int n) {
        //当前字符串
        StringBuilder currStr = new StringBuilder("1");
        //下一个字符串
        StringBuilder nextStr = new StringBuilder();

        for(int i=1;i<n;i++){
            char first = currStr.charAt(0);
            int count = 1;
            for(int j=1;j<currStr.length();j++){
                if(currStr.charAt(j) != first){
                    nextStr.append(count).append(first);
                    count = 1;
                    first = currStr.charAt(j);
                }else{
                    count++;
                }
            }
            nextStr.append(count).append(first);
            currStr = nextStr;
            nextStr = new StringBuilder();
        }
         return currStr.toString();


    }
}

