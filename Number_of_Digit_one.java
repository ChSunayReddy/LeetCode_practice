public class Number_of_Digit_one {
    public static int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long div = i * 10;
            long quotient = n / div;
            long remainder = n % div;
            count += quotient * i + Math.min(Math.max(remainder - i + 1, 0), i);
        }
        return count;
}
public static void main(String[] args) {
    int n=13;
    System.out.println(countDigitOne(n));
}
}
