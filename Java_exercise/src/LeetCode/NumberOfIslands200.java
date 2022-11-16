package LeetCode;

/**
 * @Projectname: Java_exercise
 * @Filename: NumberOfIslands200
 * @Author: EdmundXie
 * @Data:2022/11/16 17:43
 * @Email: 609031809@qq.com
 * @Description:
 * Number of Islands
 * 岛问题：求岛个数 方法与上题类似。遍历过程中，判断是否为陆地，如为陆地，对该陆地进行dfs，并将岛的数量+1
 */
public class NumberOfIslands200 {
    private int m,n;
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid){
        int num = 0;
        m = grid.length;
        n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    private void dfs(char[][] grid,int x,int y){
        if(x<0||x>=m||y<0||y>=n||grid[x][y]=='0')return;
        grid[x][y]='0';
        for(int[] d:directions){
            dfs(grid,x+d[0],y+d[1]);
        }
    }
}
