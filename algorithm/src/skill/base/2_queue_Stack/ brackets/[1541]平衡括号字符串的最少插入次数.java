//给你一个括号字符串 s ，它只包含字符 '(' 和 ')' 。一个括号字符串被称为平衡的当它满足： 
//
// 
// 任何左括号 '(' 必须对应两个连续的右括号 '))' 。 
// 左括号 '(' 必须在对应的连续两个右括号 '))' 之前。 
// 
//
// 比方说 "())"， "())(())))" 和 "(())())))" 都是平衡的， ")()"， "()))" 和 "(()))" 都是不平衡的。 
//
// 你可以在任意位置插入字符 '(' 和 ')' 使字符串平衡。 
//
// 请你返回让 s 平衡的最少插入次数。 
//
// 
//
// 示例 1： 
//
// 输入：s = "(()))"
//输出：1
//解释：第二个左括号有与之匹配的两个右括号，但是第一个左括号只有一个右括号。我们需要在字符串结尾额外增加一个 ')' 使字符串变成平衡字符串 "(())))
//" 。
// 
//
// 示例 2： 
//
// 输入：s = "())"
//输出：0
//解释：字符串已经平衡了。
// 
//
// 示例 3： 
//
// 输入：s = "))())("
//输出：3
//解释：添加 '(' 去匹配最开头的 '))' ，然后添加 '))' 去匹配最后一个 '(' 。
// 
//
// 示例 4： 
//
// 输入：s = "(((((("
//输出：12
//解释：添加 12 个 ')' 得到平衡字符串。
// 
//
// 示例 5： 
//
// 输入：s = ")))))))"
//输出：5
//解释：在字符串开头添加 4 个 '(' 并在结尾添加 1 个 ')' ，字符串变成平衡字符串 "(((())))))))" 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10^5 
// s 只包含 '(' 和 ')' 。 
// 
// Related Topics 栈 贪心 字符串 👍 37 👎 0


package QuestionTemp.leetcode.editor.cn;

public class MinimumInsertionsToBalanceAParenthesesString {
    public static void main(String[] args) {
        Solution solution = new MinimumInsertionsToBalanceAParenthesesString().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minInsertions(String s) {
            // 需要左括号的数量
            int left = 0;
            // 需要右括号的数量
            int right = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    // 每有一个左括号, 就需要两个右括号
                    right += 2;
                    // 右括号的数量为奇数，说明左右括号的数量不匹配(右括号多一个)
                    if (right % 2 == 1) {
                        // 增加一个左括号
                        left++;
                        // 本来有了一个右括号,现在还需要一个右括号
                        right--;
                    }
                } else {
                    // c 是右括号,减少一个需要的右括号
                    right--;

                    if (right == -1) {
                        left++;
                        // 因为一个左括号对应两个右括号, 所以右括号的需求变为 1
                        right = 1;
                    }
                }
            }
            return left + right;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}