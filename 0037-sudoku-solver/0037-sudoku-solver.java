class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public boolean issafe(char[][] board,int row,int col,int num){
        char ch=(char)(num+'0');
        for(int i=0;i<9;i++){
            if(board[row][i]==ch) return false;
            if(board[i][col]==ch) return false;
        }
        int sr=row-(row%3),sc=col-(col%3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+sr][j+sc]==ch) return false;
            }
        }
        return true;
    }
    public boolean solve(char[][] board,int row,int col){
        if(row==9){
            return true;
        }
        if(col==9){
            return solve(board,row+1,0);
        }
        if(board[row][col]!='.'){
            return solve(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
            if(issafe(board,row,col,i)){
                board[row][col]=(char)(i+'0');
                if(solve(board,row,col+1)) return true;
                board[row][col]='.';
            }
        }
        return false;
    }
}