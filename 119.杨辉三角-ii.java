import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i <= rowIndex;i++){
            list.add(i, 1);
            for(int j = i - 1;j > 0;j--){
                list.set(j, list.get(j-1)+list.get(j));
            }
        }
        return list;
}
}
// @lc code=end

