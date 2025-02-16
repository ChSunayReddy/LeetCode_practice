class Find_peak_Element {
    public static int findPeakElement(int[] nums) {
        int peak=nums[0];
        for (int i=0;i<nums.length;i++){
            if(nums[i]>peak){
                peak=nums[i];
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(peak==nums[i]){
                c=i;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] n={1,2,3,1};
        System.out.println(findPeakElement(n));
    }
}