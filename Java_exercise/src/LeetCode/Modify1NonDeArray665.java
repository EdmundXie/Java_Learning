package LeetCode;

/**
 * @Projectname: Java_exercise
 * @Filename: Modify1NonDeArray665
 * @Author: EdmundXie
 * @Data:2022/10/21 18:02
 * @Email: 609031809@qq.com
 * @Description:
 */
public class Modify1NonDeArray665 {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            cnt++;
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return cnt <= 1;
    }
}
