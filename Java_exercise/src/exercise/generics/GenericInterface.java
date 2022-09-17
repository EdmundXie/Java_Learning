package exercise.generics;
/*
泛型接口
 */
public interface GenericInterface<T> {
    public T method();

    default T method2() {
        return null;
    }
}
