/*
 * @lc app=leetcode.cn id=321 lang=java
 *
 * [321] 拼接最大数
 */

// @lc code=start
class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
            sort(nums1);
            sort(nums2);
            int[] result = new int[k];
            //指向两个数组指针
            int l1 = 0;
            int l2 = 0;
            for(int i = 0;i < k;i++){
                if(compare(nums1[l1], nums2[l2]) == 1){
                    result[i] = nums1[l1];
                    l1++;
                }else{
                    result[i] = nums2[l2];
                    l2++;
                }
            }
            return result;
    }


    //特定规则的排序比较算法
    //返回 -1 表示 m < n 0 m == n 1 m > n
    public static int compare(int m,int n){
        String str1 = m + "" + n;
        String str2 = n + "" + m;
        if(str1.equals(str2)){
            return 0;
        }
        for(int i = 0;i < str1.length();i++){
            if(str1.charAt(i) < str2.charAt(i)){
                return -1;
            }else if(str1.charAt(i) > str2.charAt(i)){
                return 1;
            }else{
                continue;
            }
        }
        return 0;
    }

    //运用特定排序算法 对数组进行排序
    public static void sort(int[] nums){
        for(int i = nums.length - 1;i >= 0;i--){
            for(int j = 0;j < i;j++){
                if(compare(nums[j], nums[j+1]) == -1){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}
// @lc code=end

