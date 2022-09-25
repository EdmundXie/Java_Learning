package exercise.SyntacticSugar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
增强for循环（下被注释的代码）无法增加删除对象
Iterator被创建后回建立一个指向原来对象的单链索引表，当原来的对象数量发生变化时，这个索引表的内容不会同步改变
正确方法如下：创建Iterator实例 注意：Object obj = iterator.next()
 */
public class enhancedForloop {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>(Arrays.asList(5,2,3,4,1));
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if(obj.equals(2)){
                iterator.remove();
            }
        }
        for(int stu: students){
            System.out.println(stu);
        }
//        try{
//            for(int stu: students){
//                if(stu==2){
//                    Iterator.remove(stu);
//                }
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
