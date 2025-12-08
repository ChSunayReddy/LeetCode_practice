class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int l=0,r=arr.length-1;
        while(r-l+1>k){
            int diffl = Math.abs(arr[l]-x);
            int diffr = Math.abs(arr[r]-x);
            if(diffl>diffr){
                l++;
            }
            else r--;
        }
        for(int i=l;i<=r;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}