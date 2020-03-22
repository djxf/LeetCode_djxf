/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length <= 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        if(n == 0) return false;
        int left = 0;
        int rigth = m * n -1;
        int mid  = 0;
        while(left <= rigth){
            mid = (left + rigth)/2;
            if(target == matrix[mid / n][mid % n]){
                return true;
            }else if(target > matrix[mid / n][mid % n]){
                left = mid + 1;
            }else{
                rigth = mid - 1;
            }
        }
        return false;

    }


    public int binarySearch(int[] nums ,int target){
        if(nums == null || nums.length <= 0) return -1;
        int low = 0;
        int high = nums.length -1;
        int mid = (low + high)/2;
        while(low <= high){
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                low  = mid + 1;
                mid = (low + high)/2;
            }else{
                high = mid - 1;
                mid = (low + high)/2;
            }
        }
        return -1;
    }
}
// @lc code=end

