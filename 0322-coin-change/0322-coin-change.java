class Solution {
    public int coinChange(int[] coins, int amount) {
        //Arrays.sort(coins);
        int[] arr=new int[amount+1];
        Arrays.fill(arr,amount+1);
        arr[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i>=coin){
                    arr[i]=Math.min(arr[i],arr[i-coin]+1);
                }
            }
        }
        return arr[amount]>amount ? -1 : arr[amount];
    }
}