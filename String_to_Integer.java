public class String_to_Integer {    
    public static void main(String[] args) {
        String s="1337c0d3";
        System.out.println(myAtoi(s));
    }
        public static int myAtoi(String s) {
            String[] f=s.split("");
            int n=0;
            int sign=1;
            if(isInteger(f[0])) n=n*10+Integer.parseInt(f[0]);
            if(!isInteger(f[0])) return 0;
            for (int i=1;i<f.length;i++){
                
                if(f[i].equals("-")) sign=-1;
                if(isInteger(f[i])){
                    n=n*10+Integer.parseInt(f[i]);
                }
                if(isInteger(f[i-1]) && !isInteger(f[i]) && i!=0){
                    break;
                }
            }
            return n*sign;
        }
        public static boolean isInteger(String str) {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        
    }
