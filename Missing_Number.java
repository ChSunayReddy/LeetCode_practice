public class Missing_Number {
    public static int missingNumber(int[] nums) {
        int s=0;
        for(int i:nums){
            s+=i;
        }
        int t=0;
        for(int i=0;i<=nums.length;i++){
            t+=i;
        }
        return t-s;
    }
    public static void main(String[] args) {
        int[] num={0,1,2};
        System.out.println(missingNumber(num));
    }
}
