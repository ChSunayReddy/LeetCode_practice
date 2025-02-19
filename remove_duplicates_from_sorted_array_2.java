public class remove_duplicates_from_sorted_array_2 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int k=0;
        for(int i=k+2;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                nums[k+2]=nums[i];
                k++;

            }
        }
        return k+2;
    }
    public static void main(String[] args) {
        int[] n={1,1,1,2,2,3};
        System.out.println(removeDuplicates(n));
    }
}
