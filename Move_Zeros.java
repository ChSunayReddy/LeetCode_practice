
import java.util.Arrays;

public class Move_Zeros {
    public static  void moveZeroes(int[] nums) {
        int n=nums.length;
        int z=0;
        for (int i:nums){
            if(i!=0){
                nums[z++]=i;
            }
            }
            while(z<n){
                nums[z++]=0;
            }
        }
        public static void main(String[] args) {
            int[] nums={0,1,0,3,12};
            moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
        }
}
