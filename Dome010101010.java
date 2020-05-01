import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个数字n，返回2^n - 1 种组合。
 */
public class Dome010101010 {
    public static void main(String[] args) {
        int n = 5;
        int nthBit = 1 << n;
        for(int i = 1;i <= Math.pow(2, n);i++){
            String bitmask = Integer.toBinaryString(i | nthBit);
            System.out.println(bitmask);
        }
      
    }
}