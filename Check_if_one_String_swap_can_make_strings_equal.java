public class Check_if_one_String_swap_can_make_strings_equal {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int m=-1;
        int n=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(m==-1) m=i;
                else if(n==-1) n=i;
                else return false;
            }
        }
        if(n!=-1 && s1.charAt(m)==s2.charAt(n) && s1.charAt(n)==s2.charAt(m)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s1="bank";
        String s2="kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
