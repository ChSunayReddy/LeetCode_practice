import java.util.Arrays;
class Max_num_of_k_sum_pairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=5;
        System.out.println(maxOperations(arr, k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int a=0;
        int b=nums.length-1;
        while(a<b){
            int sum=nums[a]+nums[b];
            if(sum==k){
                c++;
                a++;
                b--;
            }
            else if(sum<k) a++;
            else b--;
            
        }
        return c;
    }
}