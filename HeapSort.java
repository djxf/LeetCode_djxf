
public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,100};
        headSortNums(nums);
        for(int item : nums){
            System.out.print(item + " ");
        }
    }
    //堆排序 平均时间复杂度 n*logN
    public static int[] headSortNums(int[] nums){
        if(nums == null || nums.length <= 0){
            return nums;
        }
        buildHeap(nums, nums.length);
        int length = nums.length;
        for(int i = nums.length - 1;i > 0;i--){
            swap(nums, 0, i);
            length--;
            heapify(nums, 0, length);
        }
        return nums;
    }

    //建堆
    public static void buildHeap(int[] nums,int length){
        for(int i = length / 2 - 1;i >= 0;i--){
            heapify(nums, i, length);
        }
    }



    //buildHeap 建堆
    //@param int[] nums 要排序的数组
    //@param int i 要调整顺序的索引
    //@param int len 数组长度
    public static void heapify(int[] nums,int i,int len){
        if(nums == null || nums.length < 0){
            return;
        }
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int parent = i;
        if(left < len && nums[left] > nums[parent]){
            parent = left;
        }
        if(right < len && nums[right] > nums[parent]){
            parent = right;
        }
        if(parent != i){
            swap(nums, i, parent);
            //这里为什么还要堆化
            heapify(nums, parent, len);
        }
       
    }
    //交换数组的值
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}