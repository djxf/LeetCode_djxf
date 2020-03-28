public class Test3{
    public static void main(String[] args) {
        String str = "i love you";
        changeStr(str);
        System.out.println(str);
    }

    //字符串传递
    public static void changeStr(String str){
        str = "i not love you";
    }
}