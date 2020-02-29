/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        
        int start = 0;
        int end = cs.length-1;
        while(start < end){
            char  temp = cs[start];
            if(isVowel(temp) && isVowel(cs[end])){
                 cs[start] = cs[end];
                 cs[end] = temp;
                 start++;
                 end--;
            }
            if(!isVowel(temp)){
                start++;
            }
            if(!isVowel(cs[end])){
                end--;
            }
        }
        return String.valueOf(cs);
    }

    public boolean isVowel(char c){
        boolean is = false;
        switch(c){
            case 'a':
            case 'A':
            case 'o':
            case 'O':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'u':
            case 'U':
                is = true;
                break;
            default:
                is = false;
        }
        return is;
    }

}
// @lc code=end

