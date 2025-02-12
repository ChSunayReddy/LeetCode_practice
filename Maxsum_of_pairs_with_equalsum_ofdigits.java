import java.util.HashMap;

class Maxsum_of_pairs_with_equalsum_ofdigits {
    public static int maximumSum(int[] nums) {
        int ans=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=sum0fdigits(nums[i]);
            if(hm.containsKey(n)){
                int sum=nums[i]+hm.get(n);
                ans=Math.max(ans, sum);
                if(nums[i]>hm.get(n)){
                    hm.replace(n, nums[i]);
                }
            }
            else{
                hm.put(n, nums[i]);
            }
        }
        return ans;
    }
    public static int sum0fdigits(int n){
        int sum=0;
        for(char i:String.valueOf(n).toCharArray()){
            sum+=i-'0';
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={18,43,36,13,7};
        int[] n={10,12,19,14};
        System.out.println(maximumSum(n));
    }
}