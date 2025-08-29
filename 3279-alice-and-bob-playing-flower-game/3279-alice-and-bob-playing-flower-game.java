class Solution {
    public long flowerGame(int n, int m) {
        long on=0,en=0,om=0,em=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) en++;
            else on++;
        }
        for(int i=1;i<=m;i++){
            if(i%2==0) em++;
            else om++;
        }
        return on*em+en*om;
    }
}