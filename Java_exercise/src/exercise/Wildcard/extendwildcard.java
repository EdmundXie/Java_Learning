package exercise.Wildcard;
/*
通配符<? extends xxx> 只可读不可写。通配符的使用场景是用于接收,不知道泛型类具体是什么类型。
 */
import java.util.ArrayList;

public class extendwildcard {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);
        ArrayList<? extends Number> b = a;
        Number n = b.get(0);
        System.out.println(n);
    }
}
