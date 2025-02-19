public class Number_complement {
    public static int findComplement(int num) {
        String k=Integer.toBinaryString(num);
        int s=0;
        String j="";
        for(char ch:k.toCharArray()){
            if(ch=='1'){
                j+="0";
            }
            else{
                j+="1";
            }
        }
        
        for(int i=0;i<j.length();i++){
            
            if(j.charAt(i)=='1'){
            s+=Math.pow(2,j.length()-1- i);
        }
    }
        return s;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(findComplement(n));
    }
}
