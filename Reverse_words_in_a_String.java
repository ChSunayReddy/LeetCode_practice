public class Reverse_words_in_a_String {
    public static String reverseWords(String s) {
        String[] S=s.trim().split("\\s+");
        StringBuilder r=new StringBuilder();
        for (int i=S.length-1;i>=0;i--){
            r.append(S[i]);
            if (i>0) r.append(" ");
        }
        return r.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
