class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]>nums[j]){
                    int c=nums[i];
                    nums[i]=nums[j];
                    nums[j]=c;
                }
            }
        }
    }
}