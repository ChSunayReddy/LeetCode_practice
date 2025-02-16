public class Longest_Strictly_Increasing_or_Decreasing_subarray {
    public static int longestMonotonicSubarray(int[] nums) {
        int i=1;
        int d=1;
        int ml=1;
        int prev=nums[0];
        for(int t=1;t<nums.length;t++){
            if(nums[t]==prev){
                i=1;
                d=1;
            }
            else if(nums[t]>prev){
                i++;
                d=1;
            }
            else{
                d++;
                i=1;
            }
        
        prev=nums[t];
        int mt=Math.max(i,d);
        ml=Math.max(ml,mt);
        }
        return ml;
    }
    public static void main(String[] args) {
        int[] nums={1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(nums));
    }
}
