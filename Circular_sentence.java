public class Circular_sentence {
    public static boolean isCircularSentence(String a) {
        
        String[] b=a.split(" ");
        boolean flag=false;
        if(b.length==1){
            if(a.charAt(0)==a.charAt(a.length()-1)){
                flag=true;
            }
        }
        for(int i=0;i<b.length;i++){
            if(i+1<b.length)
                if(b[i].charAt(b[i].length()-1)==b[i+1].charAt(0) && (a.charAt(0)==a.charAt(a.length()-1))) {
                    flag=true;
                }
            else {
                flag=false;
                break;
            }
        }
        return flag;
}
public static void main(String[] args) {
    String s="leetcode exercises sound delightful";
    String a= "Leetcode is cool";
    System.out.println(isCircularSentence(s));
    System.out.println(isCircularSentence(a));
}
}
