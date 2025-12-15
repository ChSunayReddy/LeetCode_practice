class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String i:tokens){
            if(isoperand(i)){
                int a = s.pop();
                int b = s.pop();
                if(i.equals("+")){
                    s.push(a+b);
                }
                else if(i.equals("-")){
                    s.push(b-a);
                }
                else if(i.equals("*")){
                    s.push(b*a);
                }
                else if(i.equals("/")){
                    s.push(b/a);
                }
            }
            else{
                s.push(Integer.parseInt(i));
            }
        }
        return s.pop();
    }
    public boolean isoperand(String s){
        return "+-*/".contains(s);
    }
}