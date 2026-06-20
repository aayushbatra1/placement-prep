import java.util.Stack;
public class LC20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '['|| c == '{'){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else {
                    char top = stack.peek();
                    if (c == ')' && top != '(') return false;
                    if (c == ']' && top != '[') return false;
                    if (c == '}' && top != '{') return false;
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
