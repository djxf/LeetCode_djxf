import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();
        if(s.length() == 0 || s == null) return result.toString();
        if(numRows == 1) return s;
        List<StringBuilder> list = new LinkedList<>();
        for(int i = 0;i < numRows;i++){
            list.add(new StringBuilder());
        }
        int count = 0;
        int step = -1;
        for(char c : s.toCharArray()){
            list.get(count).append(c);
            if((count == numRows - 1) || count == 0){
                step = -step;
            }
            if(count <= numRows - 1 && count >= 0){
                count += step;
            }
        }
        for (StringBuilder stringBuilder : list) {
            result.append(stringBuilder.toString());
        }
        return result.toString();
    }
}
// @lc code=end

