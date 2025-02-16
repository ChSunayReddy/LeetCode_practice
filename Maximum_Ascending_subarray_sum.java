public class Maximum_Ascending_subarray_sum {
    public static int maxAscendingSum(int[] nums) {
        int c=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                c+=nums[i];
            }
            else{
                sum=Math.max(sum,c);
                c=nums[i];
            }
        }
        return Math.max(sum,c);
        }
        public static void main(String[] args) {
            int[] nums={10,20,30,5,10,50};
            System.out.println(maxAscendingSum(nums));
        }
}
