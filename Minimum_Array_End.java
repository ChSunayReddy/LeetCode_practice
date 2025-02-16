public class Minimum_Array_End {
    public static  long minEnd(int n, int x) {
        long result = x;
        long remaining = n - 1;
        long position = 1;
        
        while (remaining != 0) {
            if ((x & position) == 0) {
                result |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int n=3;
        int x=4;
        System.out.println(minEnd(n, x));
    }
}
