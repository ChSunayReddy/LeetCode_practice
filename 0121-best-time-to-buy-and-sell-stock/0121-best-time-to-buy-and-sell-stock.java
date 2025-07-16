class Solution {
    public int maxProfit(int[] nums) {
        if (nums==null || nums.length<2){
            return 0;
        }
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i:nums) {
            if (i< minPrice) {
                minPrice=i;
            } else {
                maxProfit = Math.max(maxProfit, i- minPrice);
            }
        }
        return maxProfit;
        // int p=0;
        // int n=nums.length;
        // for(int i=1;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(i<j){
        //             if(nums[i]<nums[j]){
        //                 if(nums[j]-nums[i]>p){
        //                     p=nums[j]-nums[i];
        //                 }
        //             }
        //         }
        //     }
        // }
        // return p;
    }
}