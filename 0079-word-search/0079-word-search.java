class Solution {
    public boolean exist(char[][] mat, String word) {
        int wl=word.length();
        int n=mat.length;
        int m=mat[0].length;
        if(wl>n*m) return false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(findword(mat,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
    static boolean findword(char[][] mat,String word,int x,int y,int wi){
        int wl=word.length();
        int n=mat.length;
        int m=mat[0].length;
        if(wi==wl){
            return true;
        }
        if(x<0 || y<0 || x>=n || y>=m){
            return false;
        }
        if(mat[x][y]!=word.charAt(wi)) return false;
        char temp=mat[x][y];
        mat[x][y]='#';
        boolean res=findword(mat,word,x-1,y,wi+1) || 
                    findword(mat,word,x+1,y,wi+1) || 
                    findword(mat,word,x,y-1,wi+1) || 
                    findword(mat,word,x,y+1,wi+1) ;
        mat[x][y]=temp;
        return res;
    }
}