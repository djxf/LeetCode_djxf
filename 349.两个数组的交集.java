import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int leng = nums1.length > nums2.length ? nums2.length : nums1.length;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++){
            if(set.contains((Integer)nums2[i])){
                list.add(nums2[i]);
                set.remove((Integer)nums2[i]);
            }
        }
        int [] num = new int[list.size()];
        int k = 0;
        for(Integer i : list){
            num[k] = (int) i;
            k++;
        }

        return num;
    }
}
// @lc code=end

