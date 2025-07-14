class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isequal(grid,i,j,n)){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean isequal(int[][] grid,int i,int j,int n){
        for(int k=0;k<n;k++){
                    if(grid[i][k]!=grid[k][j]){
                        return false;
                    }
                }
                return true;
    }
}