import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
            List<int[]> list = new ArrayList<>();
            if (intervals.length == 0 || intervals == null) return list.toArray(new int[0][]);
            Arrays.sort(intervals, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
            });
            for(int i = 0;i < intervals.length;i++){
                int left = intervals[i][0];
                int right = intervals[i][1];
                while(i < intervals.length - 1 && intervals[i + 1][0] <= right){
                    i++;
                    right = Math.max(right, intervals[i][1]);
                }
                int[] nums = {left,right};
                list.add(nums);
            }
            return  list.toArray(new int[1][]);
    }
}
// @lc code=end

