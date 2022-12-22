package LeetCode.DynamicProgramming;

/**
 * @Projectname: Java_exercise
 * @Filename: Knapsack
 * @Author: EdmundXie
 * @Data:2022/12/9 20:52
 * @Email: 609031809@qq.com
 * @Description:
 */
public class Knapsack {
    public static void main(String[] args) {
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        pack(weight,value,4);
    }
    private static void pack(int[] weight,int[] value,int total){
        int[] dp = new int[total+1];
        dp[0] = 0;
        for(int j=0;j<weight.length;j++){
            for(int i=total;i>=weight[j];i--){
                dp[i] = Math.max(value[j]+dp[i-weight[j]],dp[i]);
            }
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(dp[i]);
        }
    }
}
