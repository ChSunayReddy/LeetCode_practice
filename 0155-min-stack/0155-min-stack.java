class MinStack {
    Stack<int[]> m;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        m = new Stack<>();
    }
    
    public void push(int val) {   //[val,min]
        int min = m.isEmpty() ? val : Math.min(val,m.peek()[1]);
        m.push(new int[]{val,min});
    }
    
    public void pop() {
        m.pop();
    }
    
    public int top() {
       return m.peek()[0];
    }
    
    public int getMin() {
        return m.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */