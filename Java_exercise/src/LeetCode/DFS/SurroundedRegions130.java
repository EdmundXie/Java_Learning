package LeetCode.DFS;

/**
 * @Projectname: Java_exercise
 * @Filename: SurroundedRegions130
 * @Author: EdmundXie
 * @Data:2022/11/18 13:30
 * @Email: 609031809@qq.com
 * @Description:
 * Given that O cells along the boarder, and any cell connected to O cell that cannot be captured also cannot be captured,
 * we can think of it inversely by determining all the cells that CANNOT BE captured and use it to determine whether an O cell can be captured
 *
 * 1. init a set to track cells that cannot be caputured
 * 2. for each cell in the starting from the 4 boarders, run a dfs check if the cell is O
 *     2.1 add all cells adjacent to it to the set
 * 3. iterate the board again, and if the cell is O and not along the 4 boarder and is also not present in the set
 *     3.1 mark the cell to X
 *
 * However, note that instead of using additional space, we can use back the board itself to track which cells cannot be captured by marking it
 * with custom character
 *
 * if an O cell cannot be captured, we mark it as T.
 * When we iterate the board again, we change T cells back to O, and all other cells will be X
 *
 * 思路:
 * 翻被X包围的O点，边界的O点不算被包围。思路：对四边界的点做DFS，这里DFS所经过的O点改为T。
 * 在对所有点判断，若为O点则翻为X，若为T则翻为X，若为X则不变。
 */

public class SurroundedRegions130 {
    private int m,n;
    private int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][] board) {
        if(board==null||board.length==0)return;
        m = board.length;
        n = board[0].length;
        for(int i=0;i<m;i++){
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for(int j=0;j<n;j++){
            dfs(board,0,j);
            dfs(board,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
    }
    private void dfs(char[][] board,int x,int y){
        if(x<0||x>=m||y<0||y>=m||board[x][y]!='O')return;
        board[x][y]='T';
        for(int[] d:direction){
            dfs(board,x+d[0],y+d[1]);
        }
    }
}
