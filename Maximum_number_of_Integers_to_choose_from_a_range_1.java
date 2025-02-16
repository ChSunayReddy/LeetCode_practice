import java.util.HashSet;

public class Maximum_number_of_Integers_to_choose_from_a_range_1 {
    public static int maxCount(int[] banned, int n, int maxSum) {
        int c=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i:banned) s.add(i);
        int ms=0;
        for(int i=1;i<=n;i++){
            if(!s.contains(i) ){
                ms+=i;
               if(ms<=maxSum){
                c++;
               }
            }
        }
        return c;
    }
    public static void main(String[] args) {
       int[] banned = {1,2,3,4,5,6,7};
       int  n = 8;
       System.out.println(maxCount(banned, n, n));
    }
}
