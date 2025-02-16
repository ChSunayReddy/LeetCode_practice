public class Multiply_Strings {
    public static String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + products[i + j + 1]; 
                products[i + j + 1] = sum % 10; 
                products[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : products) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
//         int carry=0;
//         StringBuilder t=new StringBuilder();
//         for(int i=num1.length()-1;i>=0;i--){
//             int a=(int) num1.charAt(i)-'0';
//             int sum=0;
//             for(int j=num2.length()-1;j>=0;j--){
//                 int b=(int) num2.charAt(j)-'0';
//                 int c;
//                 if(carry!=0) c=a*b+carry; 
//                 else c=a*b;
//                 if(c>=10){
//                     carry=c/10;
//                     t.append(c%10);
//                 }
//                 else{
//                     carry=0;
//                     t.append(c);
//                 }
                
//             }
            
//         }
//         return t.toString();
    }
    public static void main(String[] args) {
        String num1="2";
        String num2="3";
        System.out.println(multiply(num1, num2));
    }
}
