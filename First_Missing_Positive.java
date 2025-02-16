import java.util.HashSet;

public class First_Missing_Positive {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
         if(nums[i]>0)  a.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!a.contains(i)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
}
