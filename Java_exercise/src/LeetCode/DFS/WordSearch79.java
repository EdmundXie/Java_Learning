package LeetCode.DFS;

/**
 * @Projectname: Java_exercise
 * @Filename: WordSearch79
 * @Author: EdmundXie
 * @Data:2022/11/20 18:40
 * @Email: 609031809@qq.com
 * @Description:
 */
public class WordSearch79 {
    private int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    private int m,n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        boolean[][] hasVisited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(i,j,board,word,hasVisited,0))return true;
            }
        }
        return false;
    }
    private boolean dfs(int x,int y,char[][] board,final String word,boolean[][] hasVisited,int k){
        if(k==word.length())return true;
        if(x<0||x>=m||y<0||y>=n||hasVisited[x][y]==true||board[x][y]!=word.charAt(k))return false;
        hasVisited[x][y] = true;
        for(int[] d:directions){
            if(dfs(x+d[0],y+d[1],board,word,hasVisited,k+1))return true;
        }
        hasVisited[x][y] = false;
        return false;
    }
}
