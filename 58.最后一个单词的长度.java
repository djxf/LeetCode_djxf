/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */
class Solution {
    public int lengthOfLastWord(String s) {
       return s.trim().length() - s.trim().lastIndexOf(" ") -1;
    }
}

