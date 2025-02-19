import java.util.Arrays;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
        private void reverse(int[] n,int i,int j){
            while(i<=j){
                int temp=n[i];
                n[i]=n[j];
                n[j]=temp;
                i++;
                j--;
            }
        }
        public static void main(String[] args) {
            Rotate_Array obj = new Rotate_Array();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        }
}
