package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: Backtrack17
 * @Author: EdmundXie
 * @Data:2022/11/19 17:12
 * @Email: 609031809@qq.com
 * @Description:
 */
public class Backtrack17 {
    private final String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits==null||digits.length()==0)return ans;
        combinations(new StringBuilder(),ans,digits);
        return ans;
    }
    private void combinations(StringBuilder str,List<String> ans,final String digits){
        if(str.length()==digits.length()){
            ans.add(str.toString());
        }
        int cur = digits.charAt(str.length())-'0';
        String letters = keys[cur];
        for(char c:letters.toCharArray()){
            str.append(c);
            combinations(str,ans,digits);
            str.deleteCharAt(str.length()-1);
        }
    }
}
