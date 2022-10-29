package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Projectname: Java_exercise
 * @Filename: Arrary2D
 * @Author: EdmundXie
 * @Data:2022/10/18 17:59
 * @Email: 609031809@qq.com
 * @Description:
 */
public class Arrary2D {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{4,5,6,7},{8,9,10,11}};
        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));
        System.out.println(a[0][0]);
    }
}
