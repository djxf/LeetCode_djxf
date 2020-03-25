import java.util.ArrayList;
import java.util.List;

public class TestDome2 {

    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        generate("abc");
        for(String item : list){
            System.out.println(item);
        }
    }


    //输入一个字符的所有排列
    public static List<String> generate(String string){
        
        char[] cs = string.toCharArray();
        char[] ss = new char[cs.length];

        for(int i = 0;i < cs.length;i++){
            generateString(cs, ss, 0, cs.length);
        }
        return list;
    }
    public static void generateString(char[] cs,char[] strs,int k,int count){
        if(k == count - 1){
            list.add(String.valueOf(strs));
            return;
        }
        strs[k] = cs[k];
        for(int i = 0;i , count);
        }
    }

}