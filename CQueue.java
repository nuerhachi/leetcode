package com.wencongxiao.leetcode;

import java.util.Stack;

class CQueue {
    Stack<Integer> firstStack;
    Stack<Integer> secondStack;

    public CQueue() {
        firstStack=new Stack<>();
        secondStack=new Stack<>();
    }

    void appendTail(int value) {
        firstStack.push(value);
    }

    int deleteHead() {

         if(!secondStack.isEmpty())
            return secondStack.pop();
        if (firstStack.isEmpty())
            return -1;
            while (!firstStack.isEmpty())
                secondStack.push(firstStack.pop());
        return secondStack.pop();
    }


}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */