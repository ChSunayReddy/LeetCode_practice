public class Largest_Combination_With_Bitwise_AND_Greater_Than_Zero {
    public static  int largestCombination(int[] candidates) {
        int ans=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int j:candidates){
                if((j & (1<<i))!=0) c++;
            }
            ans=Math.max(ans, c);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] n={16,17,71,62,12,24,14};
        System.out.println(largestCombination(n));
    }
}
