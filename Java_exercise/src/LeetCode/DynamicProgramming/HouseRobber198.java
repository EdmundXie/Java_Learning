package LeetCode.DynamicProgramming;

/**
 * @Projectname: Java_exercise
 * @Filename: HouseRobber198
 * @Author: EdmundXie
 * @Data:2022/11/30 17:25
 * @Email: 609031809@qq.com
 * @Description:
 */
public class HouseRobber198 {
    public static int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length<2)return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];dp[1] = nums[1]>nums[0]?nums[1]:nums[0];
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
