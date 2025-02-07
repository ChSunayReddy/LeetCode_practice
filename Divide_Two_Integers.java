public class Divide_Two_Integers {
    public static  int divide(int n, int d) {
        if(n==-2147483648 && d==-1) return 2147483647;
        if(n<0 && d<0) return (int)n/d;
        else return (int)n/d;
    }
    public static void main(String[] args) {
        int d=10;
        int divisor=3;
        System.out.println(divide(d, divisor));
    }
}
