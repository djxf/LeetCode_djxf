/**
 * java test
 */


public class Test{
    public static void main(String[] args) {
        int[] a = {1,2,4,66,6,5,31,33,222,22};//数组默认打印出地址
        int[] b = reserve(sort(a));
        for (int var : b) {
            System.out.println(var);
        }
        
    }

    //升序排列数组
    public static int[] sort(int[] array){
        for(int i=1;i < array.length;i++){
            int postion = i;    //当前拿的i+1个去比
            while(postion-1 >= 0 && array[postion-1] > array[postion]){
                int temp = array[postion];
                array[postion] = array[postion-1];
                array[postion-1] = temp;
                postion--;
            }

        }
        return array;
    }

    //倒转数组[1,2],[1,2,3,4]
    //        [1,2,3]
    public static int[] reserve(int[] array) {
        for(int i=0;i <= array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    //hkjkhkkhuuhggguuuuuggfguyguy6crryyvvfftyyfrtftygy
    //fdsjlfjjflsdjflsdfjdfjkk
    //
    
    
}