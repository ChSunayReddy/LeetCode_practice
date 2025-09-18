class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                String or1=s[j]+s[j+1];
                String or2=s[j+1]+s[j];
                if(or1.compareTo(or2)<0){
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        if(s[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String i:s){
            sb.append(i);
        }
        return sb.toString();
    }
}