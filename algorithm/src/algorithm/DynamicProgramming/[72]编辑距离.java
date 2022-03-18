//给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数 。 
//
// 你可以对一个单词进行如下三种操作： 
//
// 
// 插入一个字符 
// 删除一个字符 
// 替换一个字符 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：word1 = "horse", word2 = "ros"
//输出：3
//解释：
//horse -> rorse (将 'h' 替换为 'r')
//rorse -> rose (删除 'r')
//rose -> ros (删除 'e')
// 
//
// 示例 2： 
//
// 
//输入：word1 = "intention", word2 = "execution"
//输出：5
//解释：
//intention -> inention (删除 't')
//inention -> enention (将 'i' 替换为 'e')
//enention -> exention (将 'n' 替换为 'x')
//exention -> exection (将 'n' 替换为 'c')
//exection -> execution (插入 'u')
// 
//
// 
//
// 提示： 
//
// 
// 0 <= word1.length, word2.length <= 500 
// word1 和 word2 由小写英文字母组成 
// 
// Related Topics 字符串 动态规划 👍 2209 👎 0


package QuestionTemp.leetcode.editor.cn;

public class EditDistance {
    public static void main(String[] args) {
        Solution solution = new EditDistance().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minDistance(String word1, String word2) {
            // 获得字符串的长度
            int n1 = word1.length();
            int n2 = word2.length();
            // dp[i][j] == 字符串长度i 转换成 字符串长度j 最少的操作数
            int[][] dp = new int[n1 + 1][n2 + 1];
            // 初始化, word1.length() == 0
            for (int j = 1; j <= n2; j++) {
                dp[0][j] = dp[0][j - 1] + 1;
            }
            // 初始化, word2.length() == 0
            for (int i = 1; i <= n1; i++) {
                dp[i][0] = dp[i - 1][0] + 1;
            }
            // 开始循环
            for (int i = 1; i <= n1; i++) {
                for (int j = 1; j <= n2; j++) {
                    // 如果 word1[i] 与 word2[j] 相等。第 i 个字符对应下标是 i-1
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        // word1 与 word2 不一样
                        // 在 word1[i] 末尾插入一个与 word2[j] 相等的字符: dp[i][j] = dp[i][j-1] + 1;
                        // 把 word1[i] 删除: dp[i][j] = dp[i-1][j] + 1;
                        // 把 word1[i] 替换成与 word2[j] 相等: dp[i][j] = dp[i-1][j-1] + 1;
                        dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                    }
                }
            }
            return dp[n1][n2];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}