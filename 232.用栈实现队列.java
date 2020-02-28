import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {


    /** Initialize your data structure here. */
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //记录栈底元素
    private int front;
    public MyQueue() {

    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.isEmpty()){
            front = x;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int res = s1.pop();
        if(!s1.isEmpty()){
            front = s1.peek();
        }
        return res;
      
    }
    
    /** Get the front element. */
    public int peek() {
        return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
            return s1.isEmpty();
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
// @lc code=end

