import java.io.UnsupportedEncodingException;
import java.util.HashSet;

public class HashSetDome {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] byteString = "中国".getBytes("utf-8");
        byte[] bytes = "中".getBytes("utf-16");
        System.out.println(bytes.length);
        for(byte item : bytes){
            System.out.print(Integer.toHexString(Byte.toUnsignedInt(item)));
        }
        
        
    }
}