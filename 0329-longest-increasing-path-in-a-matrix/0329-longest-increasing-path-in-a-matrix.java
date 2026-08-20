class Solution {
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans = Math.max(ans, dfs(i, j, n, m, matrix, dp));
            }
        }
        return ans;
    }
    private static int dfs(int i, int j, int n, int m, int[][] arr, int[][] dp){
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int longcur = 1;
        for(int[] d:dir){
            int r = i+d[0];
            int c = j+d[1];
            if(r>=0 && r<n && c>=0 && c<m){
                if(arr[r][c] > arr[i][j]){
                    longcur = Math.max(longcur, 1+dfs(r, c, n, m, arr, dp));
                }
            }
        }
        dp[i][j] = longcur;
        return dp[i][j];
    }
}