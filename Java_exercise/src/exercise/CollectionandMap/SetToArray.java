package exercise.CollectionandMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: SetToArray
 * @Author: EdmundXie
 * @Data:2022/9/27 16:52
 * @Email: 609031809@qq.com
 * @Description:
 * 使用集合转数组的方法，必须使用集合的 toArray(T[] array)，传入的是类型完全一致、长度为 0 的空数组。
 * toArray(T[] array) 方法的参数是一个泛型数组，如果 toArray 方法中没有传递任何参数的话返回的是 Object类 型数组。
 */
public class SetToArray {
    public static void main(String[] args) {
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s = list.toArray(new String[0]); //String[0]为模版作用，指定了返回数组的类型
        for(String ss : s){
            System.out.println(ss);
        }
    }
}
