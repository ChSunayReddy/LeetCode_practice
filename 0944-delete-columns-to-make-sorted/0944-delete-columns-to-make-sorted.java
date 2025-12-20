class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length,c=0;
        int m = strs[0].length();
        for(int i=0;i<m;i++){
            char ch = strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(ch>strs[j].charAt(i)){
                    c++;
                    break;
                }
                else{
                    ch = strs[j].charAt(i);
                }
            }
        }
        return c;
    }
}