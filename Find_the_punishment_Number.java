public class Find_the_punishment_Number {
    public static void main(String[] args) {
        int n=10;
        System.out.println(punishmentNumber(n));
    }
    public static int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            if(ispartition(Integer.toString(i*i),i,0,0)) ans+=(i*i);
            }
            return ans;
        }
        public static boolean ispartition(String s,int k,int st,int cs){
            if(st==s.length()) return cs==k;
            long sum=0;
            for(int i=st;i<s.length();i++){
                sum=sum*10+(s.charAt(i)-'0');
                if(sum+cs>k) break;
                if(ispartition(s, k, i+1,cs+(int)sum)){
                    return true;
                }
            }
            return false;
        }
    }

