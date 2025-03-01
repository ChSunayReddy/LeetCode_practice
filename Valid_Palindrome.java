public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String n=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (n.isEmpty()) {
        	return true;
        }
        boolean t=false;
        int l=n.length()-1;
        for(int i=0;i<=l;i++){
            char cs=n.charAt(i);
            char cl=n.charAt(l-i);
            if(cs==cl) t=true;
            else {
                t=false;
                break;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s)); //"amanaplanacanalpanama" is a palindrome.
    }
}
