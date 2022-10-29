package LeetCode;

import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: TwoPointers524
 * @Author: EdmundXie
 * @Data:2022/10/15 14:42
 * @Email: 609031809@qq.com
 * @Description:
 * Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 * Output: "apple"
 * Example 2:
 *
 * Input: s = "abpcplea", dictionary = ["a","b","c"]
 * Output: "a"
 *
 * Solution:
 * Two pointers 写isSubString函数使用双指针判断两个字符串是否为子串，在主函数调用String类的compareTo方法将结果按字母表顺序输出最小值
 */
public class TwoPointers524 {
    public String findLongestWord(String s, List<String> dictionary) {
        int max = 0;
        String result = "";
        for(String target : dictionary){
            if(target.length()<max||(target.length()==max&&target.compareTo(result)>0)){
                continue;
            }
            if(isSubString(target, s)){
                result = target;
                max = result.length();
            }
        }
        return result;
    }
    private boolean isSubString(String target, String s){
        int i=0,j=0;
        while(i<target.length()&&j<s.length()){
            if(target.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==target.length();
    }
}
