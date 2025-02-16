public class Integer_to_Roman {
    public static String intToRoman(int num) {
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder a=new StringBuilder();
        int i=0;
        while(num>0){
            if(num>=n[i]){
                a.append(s[i]);
                num-=n[i];
            }
            else{
                i++;
            }
        }
        return a.toString();
    }
    public static void main(String[] args) {
        int n=136;
        System.out.println(intToRoman(n));
    }
}
