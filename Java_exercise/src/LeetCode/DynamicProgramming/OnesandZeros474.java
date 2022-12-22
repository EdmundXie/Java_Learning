package LeetCode.DynamicProgramming;

/**
 * @Projectname: Java_exercise
 * @Filename: OnesandZeros474
 * @Author: EdmundXie
 * @Data:2022/12/22 20:16
 * @Email: 609031809@qq.com
 * @Description:
 */
public class OnesandZeros474 {
    public static void main(String[] args) {

    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for(String s:strs){
            int zeros = 0, ones = 0;
            for(char c: s.toCharArray()){
                if (c == '0') {
                    zeros++;
                }
                else if(c == '1'){
                    ones++;
                }
            }
            for(int j=m;j>=zeros;j--){
                for(int k=n;k>=ones;k--){
                    dp[j][k] = Math.max(dp[j][k],dp[j-zeros][k-ones]+1);
                }
            }
        }
        return dp[m][n];
    }
}
