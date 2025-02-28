public class Shortest_Subarray_to_be_Removed_to_Make_Array_Sorted {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == n - 1) return 0;
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        int result = Math.min(n - left - 1, right);
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        
        return result;
     //    int c=0;
     //    for(int i=0;i<arr.length-1;i++){
     //     if(arr[i]>arr[i+1]) c++;
     // }   
     //    if(c==2) c+=1;
     //    return c;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,10,4,2,3,5};
        System.out.println(findLengthOfShortestSubarray(arr));
    }
}
