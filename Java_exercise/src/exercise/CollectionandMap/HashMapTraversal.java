package exercise.CollectionandMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Projectname: Java_exercise
 * @Filename: HashMapTraversal
 * @Author: EdmundXie
 * @Data:2022/9/26 22:04
 * @Email: 609031809@qq.com
 * @Description:
 * HashMap有七种遍历方式：
 * 使用迭代器（Iterator）EntrySet 的方式进行遍历；
 * 使用迭代器（Iterator）KeySet 的方式进行遍历；
 * 使用 For Each EntrySet 的方式进行遍历；
 * 使用 For Each KeySet 的方式进行遍历；
 * 使用 Lambda 表达式的方式进行遍历；
 * 使用 Streams API 单线程的方式进行遍历；
 * 使用 Streams API 多线程的方式进行遍历。
 *
 **** 使用迭代器（Iterator）EntrySet 的方式进行遍历；最安全快速
 */
public class HashMapTraversal {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");

        //遍历部分
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
