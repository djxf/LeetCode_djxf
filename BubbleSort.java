
class BubbleSort{
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        for(int item : nums){
            System.out.print(item+" ");
        }
        bubbleSort(nums);
        System.out.println("");
        for(int item : nums){
            System.out.print(item+" ");
        }
    }


    //冒泡排序

    public static int[] bubbleSort(int[] nums){
        if(nums == null || nums.length <= 1){
            return nums;
        }
        for(int i = nums.length - 1;i >= 0;i--){
            for(int j = 0;j < i;j++){
                if(nums[j] > nums[j + 1]){
                    swap(nums,j,j+1);
                }
            }
        }
        return nums;

    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}