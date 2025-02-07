//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
import java.util.HashSet;
public class Contains_duplicate_2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1 || k<=0) return false;
        HashSet<Integer> l=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])){
                return true;
            }
            l.add(nums[i]);
            if(l.size()>k){
                l.remove(nums[i-k]);
            }
        }
        return false;
}
public static void main(String[] args) {
    int[] nums={1,2,3,1};
    int k=3;
    System.out.println(containsNearbyDuplicate(nums, k));
}
}
