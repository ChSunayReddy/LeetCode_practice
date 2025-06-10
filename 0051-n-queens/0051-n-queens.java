class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[] board=new int[n];
        solve(board,0,n);
        return res;
    }
    public  boolean issafe(int[] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i]==col || (Math.abs(board[i]-col))==(Math.abs(i-row))){
                return false;
            }
        }
        return true;
    }
    public void solve(int[] board,int row,int n){
        if(row==n){
            res.add(print(board,n));
            return ;
        }
        for(int col=0;col<n;col++){
            if(issafe(board,row,col)){
                board[row]=col;
                solve(board,row+1,n);
            }
        }
    }
    private List<String> print(int[] board, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[board[i]] = 'Q';
            result.add(new String(row));
        }
        return result;
    }
}