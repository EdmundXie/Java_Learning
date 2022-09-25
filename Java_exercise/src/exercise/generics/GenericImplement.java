package exercise.Generics;
/*
泛型接口实现类 不指定类型：
class GeneratorImpl<T> implements Generator<T>{
    @Override
    public T method() {
        return null;
    }
}
如下为指定类型 实现类不一定为泛型类
 */
public class GenericImplement implements GenericInterface<String>{
    @Override
    public String method(){
        return "hello";
    }
    @Override
    public String method2(){
        return "edmund";
    }
}
