class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans=new int[2];
        int f=-1;
        int l=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                f=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==target){
                l=i;
                break;
            }
        }
        if(f==-1 && l==-1){
            ans[0]=f;
            ans[1]=l;
            return ans;
        }
        ans[0]=f;
        ans[1]=l;
        return ans;
    }
}