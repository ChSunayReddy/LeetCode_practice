
import java.util.*;

public class Find_the_Power_of_k_size_Subarrays_1 {
    public static int[] resultsArray(int[] nums, int k) {
        if (nums == null || nums.length < k) {
        return new int[0];
    }

    int arr[]=new int[nums.length-k+1];
    int i=0;
    int j=k-1;
    int a=0;
    while(j<nums.length){
        if(solved(nums,i,j)){
            arr[a]=nums[j];
        }
        else{
            arr[a]=-1;
        }
        i++;
        j++;
        a++;
    }
    return arr;
    
}

private static boolean solved(int nums[],int start,int end){
    for(int i=start;i<end;i++){
        if(nums[i]+1!=nums[i+1]){
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    int[] nums={1,2,3,4,3,2,5};
    int k=3;
    System.out.println(Arrays.toString(resultsArray(nums, k)));
}
}
