import java.util.Stack;

public class Test_ {
    public static void main(String[] args) {
        Test_ test_ = new Test_();
        String s = "()";

        test_.isValid(s);

    }
    public boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                left.push(c);
            else { // c 是右括号
                // s 不为空, 并且左括号与右括号相匹配, 出栈
                if (!left.empty() && charOf(c) == left.peek())
                    left.pop();
                else
                    // 左括号与右括号不匹配
                    return false;
            }
        }
        // 判断是否全部出栈
        return left.empty();
    }

    public char charOf(char c) {
        if (c == '(')
            return ')';
        if (c == '{')
            return '}';
        else
            return ']';
    }
}
