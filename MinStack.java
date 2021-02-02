package com.wencongxiao.leetcode;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack,min;
    public MinStack() {
     stack=new Stack<>();
        min=new Stack<>();
    }

    public void push(int x) {
stack.add(x);
if (min.isEmpty()||min.peek()>=x)
    min.add(x);
    }

    public void pop() {
        if (min.peek().equals(stack.peek()))
            min.pop();
stack.pop();

    }

    public int top() {
return stack.peek();
    }

    public int min() {
return min.peek();
    }


}
