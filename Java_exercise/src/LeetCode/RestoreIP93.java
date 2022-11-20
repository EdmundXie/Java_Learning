package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: RestoreIP93
 * @Author: EdmundXie
 * @Data:2022/11/20 16:44
 * @Email: 609031809@qq.com
 * @Description:
 */
public class RestoreIP93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        dfs(0,new StringBuilder(),s,ans);
        return ans;
    }
    private void dfs(int k,StringBuilder str,String s,List<String> ans){
        if(k==4||s.length()==0){
            return;
        }
        if(k==4&&s.length()==0){
            ans.add(str.toString());
            return;
        }
        for(int i=0;i<=2&&i<s.length();i++){
            if(s.charAt(0)==0&&i!=0)break;
            String part = s.substring(0,i+1);
            if(Integer.valueOf(part)<=255){
                if(str.length()!=0){
                    part = "." + part;
                }
                str.append(part);
                dfs(k+1,str,s.substring(i+1),ans);
                str.delete(str.length()-part.length(),str.length());
            }
        }
    }
}
