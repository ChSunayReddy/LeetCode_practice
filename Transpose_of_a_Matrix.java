class Transpose_of_a_Matrix {
    public static int[][] transpose(int[][] m) {
        int n=m.length;
        int c=m[0].length;
        int[][] ans=new int[c][n];
        for(int i=0;i<c;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=m[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] m={{1,2,3},{4,5,6},{7,8,9}};
        int[][] re=transpose(m);
        for(int[] i:re){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}