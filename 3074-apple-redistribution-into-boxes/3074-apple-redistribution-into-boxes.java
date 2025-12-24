class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0,n = capacity.length,c=0;
        for(int i:apple) sum+=i;
        for(int i=n-1;i>=0;i--){
            sum-=capacity[i];
            c++;
            if(sum<=0) return c;
        }
        return c;
    }
}