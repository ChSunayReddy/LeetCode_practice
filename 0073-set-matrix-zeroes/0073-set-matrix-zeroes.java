class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i:rows){
            for(int j=0;j<n;j++){
                arr[i][j] = 0;
            }
        }
        for(int i:cols){
            for(int j=0;j<m;j++){
                arr[j][i] = 0;
            }
        }
    }
}