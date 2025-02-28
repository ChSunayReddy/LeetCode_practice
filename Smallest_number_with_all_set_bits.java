public  class Smallest_number_with_all_set_bits {
    public static  int smallestNumber(int n) {
        int sum=0;
        int p=0;
        while(sum<n){
            sum+=Math.pow(2,p);
            p++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(smallestNumber(n));
    }
}
