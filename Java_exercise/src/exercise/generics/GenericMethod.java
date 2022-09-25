package exercise.Generics;
/*
静态泛型方法 预先加载 静态泛型方法优先类的实例化 使用详见main
 */
public class GenericMethod<T> {
    public static <T> void printArray(T[] inputArray){
        for(T element: inputArray){
            System.out.println(element);
        }
    }
}
