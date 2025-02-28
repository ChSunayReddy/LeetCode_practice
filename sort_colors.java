public class sort_colors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]>nums[j]){
                    int c=nums[i];
                    nums[i]=nums[j];
                    nums[j]=c;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
