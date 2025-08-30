class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                HashSet<Integer> s=new HashSet<>();
                for(int i=r;i<r+3;i++){
                    for(int j=c;j<c+3;j++){
                        if(Character.isDigit(board[i][j])){
                            int num=board[i][j]-'0';
                            if(s.contains(num)){
                                return false;
                            }
                            s.add(num);
                        }
                    }
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Integer> s=new HashSet<>();
            for(int j=0;j<9;j++){
                if(Character.isDigit(board[i][j])){
                    int num=board[i][j]-'0';
                    if(s.contains(num)){
                        return false;
                    }
                    s.add(num);
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Integer> s=new HashSet<>();
            for(int j=0;j<9;j++){
                if(Character.isDigit(board[j][i])){
                    int num=board[j][i]-'0';
                    if(s.contains(num)){
                        return false;
                    }
                    s.add(num);
                }
            }
        }
        return true;
    }
}