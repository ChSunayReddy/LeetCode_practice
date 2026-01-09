class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length, dc = 0;
        if (k > n) return 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        long sum = 0, max = 0;
        boolean isdu = false;
        for(int i=0;i<k;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            if(hm.get(nums[i])==1) dc++;
        }
        if(dc==k) max = sum;
        for(int i=k;i<n;i++){
            int add = nums[i];
            int remove = nums[i-k];
            hm.put(remove, hm.get(remove)-1);
            sum-=remove;
            if(hm.get(remove)==0){
                dc--;
                hm.remove(remove);
            }
            hm.put(add, hm.getOrDefault(add,0)+1);
            sum+=add;
            if(hm.get(add)==1) dc++;
            if(dc==k) max = Math.max(max,sum);
        }
        return max;
    }
}