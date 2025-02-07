public class Best_time_to_buy_sell_stock {
    public static int maxProfit(int[] nums) {
        if (nums==null || nums.length<2){
            return 0;
        }
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i:nums) {
            if (i< minPrice) {
                minPrice=i;
            } else {
                maxProfit = Math.max(maxProfit, i- minPrice);
            }
        }
        return maxProfit;
}

public static void main(String[] args) {
    int[] price={7,1,5,3,6,4};
    System.out.println(maxProfit(price));
}
}
