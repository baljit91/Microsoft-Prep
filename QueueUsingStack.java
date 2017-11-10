class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stk;
    public MyQueue() {
        stk =  new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        int size = stk.size();
        stk.push(x);
        while(size > 0){
            stk.push(stk.pop());
            size--;
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stk.isEmpty())
            return stk.pop();
        
        return Integer.MIN_VALUE;
    }
    
    /** Get the front element. */
    public int peek() {
        if(!stk.isEmpty())
            return stk.peek();
        
        return Integer.MIN_VALUE;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
