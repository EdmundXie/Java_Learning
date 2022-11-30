package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: BinaryTreePaths257
 * @Author: EdmundXie
 * @Data:2022/11/22 10:39
 * @Email: 609031809@qq.com
 * @Description:
 */
public class BinaryTreePaths257 {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
             this.right = right;
         }
     }
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            dfs(root,paths,values);
            return paths;
        }
        private void dfs(TreeNode root,List<String> paths,List<Integer> values){
            if(root==null){
                return;
            }
            values.add(root.val);
            if(isleaf(root)){
                paths.add(buildpaths(values).toString());
            }
            else{
                dfs(root.left,paths,values);
                dfs(root.right,paths,values);
            }
            values.remove(values.size()-1);
        }
        private boolean isleaf(TreeNode node){
            return (node.left==null&&node.right==null);
        }
        private StringBuilder buildpaths(List<Integer> values){
            StringBuilder str = new StringBuilder();
            for(int i=0;i<values.size();i++){
                str.append(values.get(i));
                if(i<values.size()-1){
                    str.append("->");
                }
            }
            return str;
        }
    }
}
