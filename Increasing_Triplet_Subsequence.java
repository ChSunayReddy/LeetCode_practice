public class Increasing_Triplet_Subsequence {
    public static boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3) return false;
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(nums[i]>b) return true;
            else if(nums[i]>a) b=nums[i];
            else if (nums[i]<a) a=nums[i];
            
        }
        return false;
}
public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    System.out.println(increasingTriplet(nums));
}
}
