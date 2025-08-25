class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] ans= new int[n*m];
        int l=0,r=0;
        boolean up=true,down=false;
        for(int i=0;i<n*m;i++){
            ans[i]=mat[l][r];
            if (up){
                if(r==m-1){
                    up=false;
                    down=true;
                    l++;
                }
                else if(l==0){
                    up=false;
                    down=true;
                    r++;
                }
                else{
                    l--;
                    r++;
                }
            }
            else if(down){
                if(l==n-1){
                    up=true;
                    down=false;
                    r++;
                }
                else if(r==0){
                    up=true;
                    down=false;
                    l++;
                }
                else{
                    r--;
                    l++;
                }
            }
        }
        return ans;
    }
}