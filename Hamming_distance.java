public class Hamming_distance {
    public static void main(String[] args) {
        int x=1;
        int y=4;
        System.out.println(hammingDistance(x, y));
    }
    public static  int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
