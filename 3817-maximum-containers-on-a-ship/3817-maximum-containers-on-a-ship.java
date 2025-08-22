class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans=0;
        int ng=n*n;
        int totw=ng*w;
        if(totw<=maxWeight) return ng;
        else{
            int tt=totw;
            int g=ng;
            while(tt>maxWeight && n!=0){
                tt-=w;
                g--;
                ans++;
            }
            return ng-ans;
        }
    }
}