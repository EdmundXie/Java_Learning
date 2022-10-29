package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: PartitionLabels763
 * @Author: EdmundXie
 * @Data:2022/10/25 14:59
 * @Email: 609031809@qq.com
 * @Description:
 */
public class PartitionLabels763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partition = new ArrayList<>();
        int[] lastchar = new int[26];
        for(int i=0;i<s.length();i++){
            lastchar[charToint(s.charAt(i))] = i;
        }
        int firstIndex = 0;
        while(firstIndex<s.length()){
            int lastIndex = firstIndex;
            for(int i=firstIndex;i<s.length()&&i<=lastIndex;i++){
                int index = lastchar[charToint(s.charAt(i))];
                if(index > lastIndex){
                    lastIndex = index;
                }
            }
            partition.add(lastIndex-firstIndex+1);
            firstIndex = lastIndex + 1;
        }
        return partition;
    }
    private int charToint(char c){
        return c - 'a';
    }
}
