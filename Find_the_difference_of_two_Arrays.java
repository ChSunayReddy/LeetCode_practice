import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Find_the_difference_of_two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i:nums1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        for(int i:map1.keySet()){
            if(!map2.containsKey(i)){
                l1.add(i);
            }
        }
        List<Integer> l2=new ArrayList<>();
        for(int i:map2.keySet()){
            if(!map1.containsKey(i)){
                l2.add(i);
            }
        }
        return Arrays.asList(l1,l2);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result);
    }
}
