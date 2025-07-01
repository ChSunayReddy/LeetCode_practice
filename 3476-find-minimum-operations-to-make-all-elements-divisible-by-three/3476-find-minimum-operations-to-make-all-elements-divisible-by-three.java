class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i:nums){
            int min=0;
            int max=0;
            if(i%3==0) continue;
            else if(i==2 || i==1) ans++;
            else{
                int j=i;
                while(j%3!=0){
                    j--;
                    min++;
                }
                while(i%3!=0){
                    i++;
                    max++;
                }
            ans+=Math.min(min,max);
            }
        }
        return ans;
    }
}