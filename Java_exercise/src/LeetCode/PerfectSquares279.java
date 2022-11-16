package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: PerfectSquares279
 * @Author: EdmundXie
 * @Data:2022/11/14 16:47
 * @Email: 609031809@qq.com
 * @Description:
 */
public class PerfectSquares279 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        int n = 9;
//        for(int i=1;i*i<n;i++){
//            list.add(i*i);
//        }
        List<Integer> list = new ArrayList<>();
        int square = 1;
        int diff = 3;
        while (square <= n) {
            list.add(square);
            square += diff;
            diff += 2;
        }
        //print
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
