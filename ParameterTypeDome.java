import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
/**
 * 利用方法签名得到函数返回值得泛型擦除前得类型
 */
public class ParameterTypeDome {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {

        ParameterizedType methodType = (ParameterizedType)SubClass.class.getMethod("getValue").getGenericReturnType();
        for(Type type : methodType.getActualTypeArguments()){
            System.out.println(type);
        }
    }
}

//父类
class SuperClass<T> {

}

//子类
class SubClass extends SuperClass<String>{
    public List<Map<String,Integer>> getValue(){
        return null;
    }
}