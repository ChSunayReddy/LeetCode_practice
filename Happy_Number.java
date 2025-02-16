import java.util.HashSet;
public class Happy_Number {
    public static  boolean isHappy(int n) {
       HashSet<Integer> s=new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=happy(n);
        }
        return n==1;
    }
        public static int happy(int n){
        int num=0;
        while(n>=1){
            int r=n%10;
            num+=r*r;
            n/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
}
