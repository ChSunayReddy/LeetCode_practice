class Solution {
    public int totalMoney(int n) {
        int res=0;
        int j=1;
        int ini=1;
        for(int i=1;i<=n;i++){
            res+=j;
            j++;
            if(i%7==0){
                j=ini+1;
                //res+=j;
                ini=j;
            }
        }
        return res;
    }
}