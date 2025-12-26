class Solution {
    public int bestClosingTime(String cus) {
        int n = cus.length(), yc=0;
        for(int i=0;i<n;i++){
            if(cus.charAt(i)=='Y') yc++;
        }
        int minp = yc;
        int nc = 0;
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(cus.charAt(i-1)=='Y'){
                yc--;
            }
            else nc++;
            int min = yc+nc;
            if(min<minp){
                minp = min;
                ans = i;
            }
        }
        return ans;
    }
}