public class String_Compression {
    public static int compress(char[] chars) {
        int i=0;
        int ind=0;
        int c=chars.length;
        while(i<c){
            int cn=0;
            char b=chars[i];
            while(i<c && chars[i]==b){
                cn++;
                i++;
            }
            chars[ind++]=b;
        
        if(cn>1){
            for(char k:Integer.toString(cn).toCharArray()){
                chars[ind++]=k;
            }
        }
        }
        return ind;
    }
    public static void main(String[] args) {
        char[] c={'a','a','b','b','c','c','c'};
        System.out.println(compress(c));
    }
}
