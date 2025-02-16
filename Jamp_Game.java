public class Jamp_Game {
    public static boolean canJump(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i>j) return false;
            j=Math.max(j,i+nums[i]);
            if(j>=nums.length-1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
