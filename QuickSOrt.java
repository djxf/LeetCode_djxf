
public class QuickSOrt {
    public static void main(String[] args) {
        
    }

    //划分函数
    public static int partition(int[] nums,int length,int start,int end){
        if(nums.length <= 0 || nums.length < 0){
            return -1;
        }

        int index = start;
        swap(nums,index,end);
        int swapIndex = start - 1;
        for(int i = start;i <= end;i++){
            if(nums[i] < nums[end]){
                swapIndex++;
                if(swapIndex != index){
                    swap(nums,index,swapIndex);
                }
            }
        }
        swapIndex++;
        swap(nums,swapIndex,end);
        return swapIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}