
public class test{

public static void main(String[] args) {

        System.out.println(addStrings("9999","9999"));
    }

    public static String addStrings(String num1, String num2) {

        StringBuilder str = new StringBuilder();

         int i = num1.length()-1;
         int j = num2.length()-1;
         //初始进位0
         int carry = 0;
         while(i >= 0 || j >= 0){
             int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
             int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
             int temp = n1 + n2 +carry;
             carry = temp / 10;
             str.append(temp % 10);
             i--;
             j--;
         }
         //最后判断是否进位
         if(carry == 1){
             str.append(1);
         }
        return str.reverse().toString();
        
 }
}