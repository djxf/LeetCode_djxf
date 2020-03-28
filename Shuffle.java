import java.util.Random;

public class Shuffle{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,};
        for(int item : arr){
            System.out.print(item+"  ");
        }
        System.out.println("");
        shuffle(arr);
        for(int item : arr){
            System.out.print(item+"  ");
        }
    }


    //讲数组均匀打乱 类似于洗牌功能
    public static int[] shuffle(int[] arr){
        if(arr == null){
            return null;
        }
        Random random = new Random();
        for(int i = arr.length;i >= 1;i--){
            //nextInt 只接受正数 不接受0 
            swap(arr,i - 1,random.nextInt(i));
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int nextInt) {
        int temp = arr[i];
        arr[i] = arr[nextInt];
        arr[nextInt] = temp;
    }
}