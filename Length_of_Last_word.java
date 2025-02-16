public class Length_of_Last_word {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        String[] a=s.split(" ");
        int l=a[a.length-1].length();
        return l;
    }
    public static void main(String[] args) {
        String s="Hello World";
        String S="luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(S));
    }
}
