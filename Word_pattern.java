import java.util.HashMap;
import java.util.Map;

public class Word_pattern {
    public static  boolean wordPattern(String pattern, String s) {
        String[] a=pattern.split("");
        String[] b=s.split(" ");
        if(a.length!=b.length) return false;
        Map<String,String> pw=new HashMap<>();
        Map<String,String> wp=new HashMap<>();
        for(int i=0;i<a.length;i++){
            String c=a[i];
            String word=b[i];
            if(pw.containsKey(c)){
                if(!pw.get(c).equals(word)){
                    return false;
                }
            }else{
                pw.put(c,word);
            }
            if(wp.containsKey(word)){
                if(!wp.get(word).equals(c)){
                    return false;
                }
            }else{
                wp.put(word,c);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
