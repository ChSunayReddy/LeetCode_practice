class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] b=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            boolean p=false;
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j] && !b[j]){
                    b[j]=true;
                    p=true;
                    break;
                }
            }
            if(!p) c++;
        }
        return c;
    }
}