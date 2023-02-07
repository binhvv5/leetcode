package main.java.string.ValidParentheses;

import java.util.Objects;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()){
            if (c=='{'){
                stack.push('}');
            }else if (c=='['){
                stack.push(']');
            }
            else if (c=='('){
                stack.push(')');
            }else if (stack.empty() ||  stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
