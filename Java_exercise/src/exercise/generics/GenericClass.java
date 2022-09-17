package exercise.generics;
/*
泛型类，使用时必须指定T的类型
GenericClass<Integer> GC = new GenericClass<>(3456);
 */
public class GenericClass<T>{
    private T key;
    public static int value = 5;

    public GenericClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
