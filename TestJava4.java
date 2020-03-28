import java.util.HashMap;
import java.util.Map;

public class TestJava4 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }


    public static boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        char[] cs = pattern.toCharArray();
        if(pattern.length() != strs.length){
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        for(int i = 0;i < cs.length;i++){
            if(map.containsKey(cs[i])){
                if(!map.get(cs[i]).equals(strs[i])){
                    System.out.println(i);
                    return false;
                }
            }else{
                map.put(cs[i], strs[i]);
            }
        }
        return true;
}
}