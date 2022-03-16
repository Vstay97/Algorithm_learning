//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 👍 3078 👎 0


package QuestionTemp.leetcode.editor.cn;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
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
            if (c == ')')
                return '(';
            if (c == '}')
                return '{';
            else
                return '[';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}