class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        return Math.max(calc(nums1,nums2), calc(nums2,nums1));
    }
    private int calc(int[] arr, int[] nums){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int arri = i;
            int numsi = 0,c=0;
            while(arri < arr.length && numsi < nums.length){
                if(arr[arri] == nums[numsi]){
                    c++;
                    max = Math.max(max,c); 
                }
                else c=0;
                arri++;
                numsi++;
            }
        }
        return max;
    }
}