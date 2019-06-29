/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
class Solution {
    public boolean isValid(String s) {

        String str = s;
        int length;
        do{
            length = str.length();
            str = str.replace("{}","").replace("()","").replace ("[]","");
        }while(str.length() != length);

        return length==0;

    }
}

