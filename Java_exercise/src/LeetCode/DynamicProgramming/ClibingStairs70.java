package LeetCode.DynamicProgramming;

/**
 * @Projectname: Java_exercise
 * @Filename: ClibingStairs70
 * @Author: EdmundXie
 * @Data:2022/11/30 16:40
 * @Email: 609031809@qq.com
 * @Description:
 */
public class ClibingStairs70 {
    public static int climbStairs(int n) {
        if(n<=2)return n;
        int[] mem = new int[n+1];
        mem[1]=1;mem[2]=2;
        if(mem[n]!=0)return mem[n];
        mem[n]=climbStairs(n-1)+climbStairs(n-2);
        return mem[n];
    }

    public static void main(String[] args) {
        int i = climbStairs(4);
        System.out.println(i);
    }
}
