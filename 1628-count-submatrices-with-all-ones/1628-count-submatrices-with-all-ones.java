class Solution {
    public int numSubmat(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] dp=new int[m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    dp[j]=0;
                }
                else{
                    dp[j]+=1;
                }
            }
            for(int j=0;j<m;j++){
                int min=dp[j];
                for(int k=j;k>=0 && min>0;k--){
                    min=Math.min(min,dp[k]);
                    c+=min;
                }
            }
        }
        return c;
    }
}