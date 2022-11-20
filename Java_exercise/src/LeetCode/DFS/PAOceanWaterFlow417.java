package LeetCode.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Projectname: Java_exercise
 * @Filename: PAOceanWaterFlow417
 * @Author: EdmundXie
 * @Data:2022/11/18 14:43
 * @Email: 609031809@qq.com
 * @Description:
 * 思路与上题类似，题目求能积水流到四边界的点，即求从四边界能不能流的点，创建两个boolean[][]代表点到P海和A海的可达性
 */
public class PAOceanWaterFlow417 {
    private int m,n;
    private int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    private int[][] heights;
    public List<List<Integer>> pacificAtlantic(int[][] heights){
        m = heights.length;
        n = heights[0].length;
        this.heights = heights;
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] canReachA = new boolean[m][n];
        boolean[][] canReachP = new boolean[m][n];
        for(int i=0;i<m;i++){
            dfs(canReachP,i,0);
            dfs(canReachA,i,n-1);
        }
        for(int j=0;j<n;j++){
            dfs(canReachP,0,j);
            dfs(canReachA,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(canReachA[i][j]&&canReachP[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    private void dfs(boolean[][] canReach,int x,int y){
        if(canReach[x][y])return;
        canReach[x][y] = true;
        for(int[] d:directions){
            int nx = x+d[0];
            int ny = y+d[1];
            if(nx<0||nx>=m||ny<0||ny>=n)continue;
            else if(heights[x][y]<=heights[nx][ny]){
                dfs(canReach,nx,ny);
            }
        }
    }
}
