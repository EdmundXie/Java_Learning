package LeetCode;

/**
 * @Projectname: Java_exercise
 * @Filename: MaxAreaofIsland695
 * @Author: EdmundXie
 * @Data:2022/11/16 17:18
 * @Email: 609031809@qq.com
 * @Description:
 * 岛问题DFS思路：建立directions数组，遍历所有节点递归进行DFS。
 */
public class MaxAreaofIsland695 {
    private int m,n;
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid){
        if(grid==null||grid.length==0)return 0;
        m = grid.length;
        n = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maxArea = Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return maxArea;
    }
    private int dfs(int[][] grid,int x,int y){
        if(x<0||x>=m||y<0||y>=n||grid[x][y]==0){
            return 0;
        }
        int area =1;
        for(int[] d:directions){
            area+= dfs(grid,x+d[0],y+d[1]);
        }
        return area;
    }
}
