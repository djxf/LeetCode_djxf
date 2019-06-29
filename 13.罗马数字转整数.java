import jdk.nashorn.internal.runtime.FindProperty;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *  巧妙
 *  将字符转换为下标存储相应的数值
 * [13] 罗马数字转整数
 */
class Solution {
    public int romanToInt(String s) {
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
         
        char prev = 'A';
        int sum = 0;
        for (char c : s.toCharArray()) {
            if(a[c - 'A'] > a[prev - 'A']){
                sum -= 2*a[prev - 'A'];
            }
            sum += a[c - 'A'];
            prev = c;
        }
        
        return sum;
    }
}

