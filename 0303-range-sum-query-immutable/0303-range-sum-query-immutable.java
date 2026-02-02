class NumArray {
    int[] pre;
    public NumArray(int[] nums) {
        int n = nums.length;
        pre = new int[n];
        int sum = 0;
        //pre[0] = sum;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            pre[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        return pre[right] - ((left>0) ? pre[left-1] : 0) ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */