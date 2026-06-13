public class Solution {
    public int solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        
        boolean[][] redLake = new boolean[rows][cols];
        boolean[][] blueLake = new boolean[rows][cols];
        
        for (int i =0; i<rows; i++){
            dfs(A, i, 0, redLake);
            dfs(A, i, cols-1, blueLake);
        }
        for (int j=0; j< cols; j++){
            dfs(A, 0, j, redLake);
            dfs(A, rows-1, j, blueLake);
        }
        int cells = 0;
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if(redLake[i][j] && blueLake[i][j]){
                    cells++;
                }
            }
        }
        
        return cells;
    }
    private void dfs(int[][] A, int row, int col, boolean[][] visited){
            int[][] directions = {{0,1}, {-1,0}, {1,0},{0,-1}};
            visited[row][col] = true;
            for (int[] dir: directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                if (newRow >= 0 && newRow < A.length 
                && newCol >=0 && newCol < A[0].length 
                && A[newRow][newCol] >= A[row][col]
                && !visited[newRow][newCol]){
                    dfs(A, newRow, newCol, visited);
                }
            }
        }
}
