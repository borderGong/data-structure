import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }

            if(stack.empty())
                return false;

            char next = stack.peek();
            if(c == ')' && next == '('){
                stack.pop();
                continue;
            }

            if(c == ']' && next == '['){
                stack.pop();
                continue;
            }

            if(c == '}' && next == '{'){
                stack.pop();
                continue;
            }

        }
        return stack.empty();
    }
}
