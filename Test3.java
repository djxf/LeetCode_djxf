public class Test3{
    public static void main(String[] args) {
        String str = "i love you";
        changeStr(str);
        System.out.println(str);

        int i = 0;
        while(true){
            Person object = new Person("张三");
            System.out.println(++i);
        }
    }

    //字符串传递
    public static void changeStr(String str){
        str = "i not love you";
    }
}