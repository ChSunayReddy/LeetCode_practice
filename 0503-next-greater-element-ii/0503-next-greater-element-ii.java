class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    c++;
                    break;
                }
            }
            if(c==0 && i!=0){
                for(int j=0;j<n-1;j++){
                    if(arr[i]<arr[j]){
                        ans[i]=arr[j];
                        c++;
                        break;
                    }
                }
            }
            if(c==0) ans[i]=-1;
        }
        return ans;
    }
}