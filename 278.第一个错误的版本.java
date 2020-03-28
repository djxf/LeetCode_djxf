/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid = low + (high - low)/2;
        while(low < high){
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
            mid = low + (high - low)/2;
        }
        return low;
    }
}
// @lc code=end

