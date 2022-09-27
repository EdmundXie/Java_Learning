package exercise.CollectionandMap;

import java.util.*;

/**
 * @Projectname: Java_exercise
 * @Filename: removeDuplicate
 * @Author: EdmundXie
 * @Data:2022/9/27 16:32
 * @Email: 609031809@qq.com
 * @Description:
 * 转为Set去重，利用Set元素唯一的特性，若有n个元素去重的时间复杂度为O(n)
 */
public class removeDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,3,5,1));
        Set<Integer> set = removeDuplicateByset(list);
        for(int l : set){
            System.out.println(l);
        }
    }
    public static <T> Set<T> removeDuplicateByset(List<T> data){
        if(data.isEmpty()){
            return new HashSet<>();
        }
        return new HashSet<>(data);
    }
}
