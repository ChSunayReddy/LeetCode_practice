class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1=String.format("%04d",num1);
        String s2=String.format("%04d",num2);
        String s3=String.format("%04d",num3);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            int no1=s1.charAt(i)-'0';
            int no2=s2.charAt(i)-'0';
            int no3=s3.charAt(i)-'0';
            int min=Math.min(no3,Math.min(no1,no2));
            sb.append(min);
        }
        return Integer.parseInt(sb.toString());
    }
}