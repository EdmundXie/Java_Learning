package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: Palindrome131
 * @Author: EdmundXie
 * @Data:2022/11/27 15:20
 * @Email: 609031809@qq.com
 * @Description:
 */
public class Palindrome131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> part = new ArrayList<>();
        backtracking(s,ans,part);
        return ans;
    }
    private void backtracking(String s,List<List<String>> ans,List<String> part){
        if(s.length()==0){
            ans.add(new ArrayList(part));
            return;
        }
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,0,i)){
                part.add(s.substring(0,i+1));
                backtracking(s.substring(i+1),ans,part);
                part.remove(part.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
