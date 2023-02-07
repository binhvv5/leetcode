package main.java.Queue;

import java.util.Iterator;
import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/
//232. Implement Queue using Stacks
public class MyQueue {
    Stack<Integer> stack ;
    Stack<Integer> stack2;
    public MyQueue() {
        stack= new Stack();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        Iterator<Integer> iterator = stack.iterator();
        stack2 = new Stack();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            stack2.push(integer);
        }
        stack = new Stack<>();
        while (stack2.iterator().hasNext()){
            stack.push(stack2.iterator().next());
        }
        return stack2.pop();
    }

    public int peek() {
        Iterator<Integer> iterator = stack.iterator();

        while (iterator.hasNext()){
            return iterator.next();
        }
        return 0;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
