import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0, i=m ;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }   
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int m=3;
        int[] num2={2,5,6};
        int n=3;
        merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }
}
