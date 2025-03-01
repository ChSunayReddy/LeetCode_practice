public class Valid_Perfect_square {
    public static boolean isPerfectSquare(int num) {
        long mid,low=1,high=num;
       while(low<=high){
        mid=(low+high)/2;
        if(mid*mid==num){
            return true;
        }
        else if(mid*mid<=num){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return false;
    }
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
}
