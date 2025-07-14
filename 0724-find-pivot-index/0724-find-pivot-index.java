class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] suml=new int[n];
        int[] sumr=new int[n];
        suml[0]=0;
        sumr[n-1]=0;
        for(int i=1;i<n;i++){
            suml[i]=nums[i-1]+suml[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sumr[i]=nums[i+1]+sumr[i+1];
        }
        for(int i=0;i<n;i++){
            if(suml[i]==sumr[i]){
                return i;
            }
        }
        return -1;
    }
}