class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int mr = arr[n-1];
        res[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            res[i] = mr;
            if(arr[i]>mr){
                mr = arr[i];
            }
        }
        return res;
    }
}