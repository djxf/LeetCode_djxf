import java.util.ArrayList;

/**
 * 泛型 since jdk 1.5
 * 
 *  JAVA泛型使用是否仅停留在集合框架的使用(初级)

*   对java泛型的实现机制的认知和理解(中级)。

*   是否有足够的项目开发实战和采坑经验(高级)。

*   对泛型(或模板)编程是否有深入的对比研究(高级)。

*   对常见的框架原理是否有过深入理解(高级)。
 * 
 */

public class ParameterType{
    public static void main(String[] args) {
        
        //在jdk 8 测试是否可以使用裸类型
        ArrayList list = new ArrayList();
        list.add("hello world");
        System.out.println(list.get(0));//hello world



        // 2 为避免泛型装箱拆箱带来的性能损耗 Google 采用 

        

        //泛型的限制
        //1 泛型类型无法用着方法重载
        //2 泛型类型无法当做真实类型转换
        //比如： T[] array = new T[0];
        // Class c = T.class 错误
        // if(list instanceof List<String>) 错误
        //3 静态方法无法引用类泛型参数 字节码中自动强转

        // 类型强转的运行时开销
        

        //附加的签名信息

        
    
    }


    // Gson.fromJson为什么需要传入Class
    public <T> T fromJson(String json,Class<T> classOfT){
        Object object = fromJson(json, (Type)classOfT);
        return Primitives.wrap(classOfT).cast(object);
    }

    // 静态方法无法引用类泛型参数
    // static 方法不需要类的实例 类实例必须实例化之后才知道泛型类型
    // 但是可以直接声明泛型类型
    static class GenericClass<T> {

        public static T max(T a,T b){

        }

        public static <R> R max2(R a, R b) {

        }
    }


    //迁移：Kotlin反射的实现原理

    //阐述观点给出实际案列例如Gson，Retrofit。

    //混淆原理
   
}