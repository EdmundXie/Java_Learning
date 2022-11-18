package LeetCode.DFS;

/**
 * @Projectname: Java_exercise
 * @Filename: NumberOfProvinces547
 * @Author: EdmundXie
 * @Data:2022/11/16 18:14
 * @Email: 609031809@qq.com
 * @Description:
 * Number of Provinces
 * 无向图的联通问题,岛问题从二维数组的每一个元素出发，这里从每一个节点出发
 */
public class NumberOfProvinces547 {
    private int m;
    public int findCircleNum(int[][] isConnected){
        m = isConnected.length;
        boolean[] isVisited = new boolean[m];
        int num = 0;
        for(int i=0;i<m;i++){
            if(!isVisited[i]){
                dfs(isConnected,i,isVisited);
                num++;
            }
        }
        return num;
    }
    private void dfs(int[][] grid;int x;boolean[] isVisited){
        isVisited[x] = true;
        for(int k=0;k<m;k++){
            if(grid[x][k]==1&&isVisited[k]!=true){
                dfs(grid,k,isVisited);
            }
        }
    }
}
