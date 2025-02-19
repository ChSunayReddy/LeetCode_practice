import java.util.Arrays;

public class Next_permutation {
        public static void nextPermutation(int[] nums) {
            int idx=nums.length-1;
            for(int i=0;i<nums.length;i++){
                swap(nums,i,idx);
                
            }
        }
        public static  void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public static void main(String[] args) {
            int[] nums={1,2,3};
            System.out.println(Arrays.toString(nums));
        }
    }
    // class Solution {
    //     public void nextPermutation(int[] nums) {
    //         int n = nums.length;
    //         int i = n - 2;
            
    //         // Step 1: Find the first index 'i' from the right where nums[i] < nums[i+1]
    //         while(i >= 0 && nums[i] >= nums[i+1]) {
    //             i--;
    //         }
            
    //         // Step 2: If such an index exists, find the first index 'j' from the right such that nums[j] > nums[i]
    //         if(i >= 0) {
    //             int j = n - 1;
    //             while(nums[j] <= nums[i]) {
    //                 j--;
    //             }
    //             swap(nums, i, j);
    //         }
            
    //         // Step 3: Reverse the sub-array from i+1 to the end to get the next permutation
    //         reverse(nums, i + 1, n - 1);
    //     }
        
    //     // Helper function to swap two elements in the array
    //     private void swap(int[] nums, int i, int j) {
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //     }
        
    //     // Helper function to reverse the sub-array from index 'start' to 'end'
    //     private void reverse(int[] nums, int start, int end) {
    //         while(start < end) {
    //             swap(nums, start, end);
    //             start++;
    //             end--;
    //         }
    //     }
    // }
    