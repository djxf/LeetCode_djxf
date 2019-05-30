import java.util.Random;

class Test2{
    public static void main(String[] args) {
      
      //StringBuilder:可变的字符序列，不同步。
      //StringBuffer:线程安全。
      //把一个数按照报数序列读出来。
      String num = "3242";
      StringBuilder target = new StringBuilder();
      char first = num.charAt(0);
      int count = 1;
      for(int i=1;i<num.length();i++){
          if(num.charAt(i) != first){
                target.append(count).append(first);
                count = 1;
                first = num.charAt(i);
          }else{
               count++;
          }
      }
      target.append(count).append(first);
     
    }
}