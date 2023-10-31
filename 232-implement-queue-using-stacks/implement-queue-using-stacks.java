class MyQueue {
    private Stack<Integer> st = new Stack();
    private Stack<Integer> sk = new Stack();

    public MyQueue() {

    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if (sk.isEmpty()) {
            while (!st.isEmpty()) {
                int t = st.pop();
                sk.push(t);
            }
        }
        return sk.pop();
    }

    public int peek() {
        if (sk.isEmpty()) {
            while (!st.isEmpty()) {
                int t = st.pop();
                sk.push(t);
            }
        }
        return sk.peek();
    }

    public boolean empty() {
        return st.isEmpty() && sk.isEmpty();
    }

    public static void main(String[] args) {

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