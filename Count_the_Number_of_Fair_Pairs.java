import java.util.Arrays;

public class Count_the_Number_of_Fair_Pairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
    Arrays.sort(nums);
    return getPairsLessThan(nums, upper+1)-getPairsLessThan(nums, lower);    
    }
    public static long getPairsLessThan(int nums[], int val)
    {
      int left = 0, right = nums.length-1;
      long res = 0;
      while(left<=right)
      {
        if((nums[left]+nums[right])<val)
        {
            res += right-left;
            left++;
        }
        else
             right--;
      }  
      return res;
    }
    public static void main(String[] args) {
        int[] n={0,1,7,4,4,5};
        int l=3;
        int u=6;
        System.out.println(countFairPairs(n, l, u));
    }
}
