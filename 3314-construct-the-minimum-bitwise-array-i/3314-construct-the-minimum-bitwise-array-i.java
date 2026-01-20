class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        ans[0]=0;
        for(int i=0;i<n;i++){
            int c=0;
            if(nums.get(i)<=2){
                ans[i] = -1;
                continue;
            }
            while(c<nums.get(i)&& (c | c+1)!=nums.get(i)){
                c++;
            }
            ans[i] = (c==0) ? -1 : c;
        }
        return ans;
    }
}