//给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。 
//
// 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。 
//
// 你可以认为每种硬币的数量是无限的。 
//
// 
//
// 示例 1： 
//
// 
//输入：coins = [1, 2, 5], amount = 11
//输出：3 
//解释：11 = 5 + 5 + 1 
//
// 示例 2： 
//
// 
//输入：coins = [2], amount = 3
//输出：-1 
//
// 示例 3： 
//
// 
//输入：coins = [1], amount = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= coins.length <= 12 
// 1 <= coins[i] <= 2³¹ - 1 
// 0 <= amount <= 10⁴ 
// 
// Related Topics 广度优先搜索 数组 动态规划 👍 1801 👎 0


package QuestionTemp.leetcode.editor.cn;

public class CoinChange {
    public static void main(String[] args) {
        Solution solution = new CoinChange().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 状态：目标金额 amount
        // 选择：coins中列出的所有硬币的金额
        // 数组定义：当目标金额为 i 时，至少需要 dp[i] 枚硬币凑出
        // base case：amount == 0 时, 需要 0 枚硬币; amount <0 时, 不可能凑出
        public int coinChange(int[] coins, int amount) {
            // 定义DP数组
            int[] dp = new int[amount + 1];

            // 初始化: 最少需要的硬币个数不可能大于amount
            // 对数组进行填充
            Arrays.fill(dp, amount + 1);

            // base case
            dp[0] = 0;

            // 开始循环
            // 遍历所有状态: 原问题和子问题中会变化的变量
            for (int i = 0; i < dp.length; i++) {
                // 遍历所有选择: 导致「状态」产生变化的行为
                for (int coin : coins) {
                    // 子问题无解，跳过
                    if (i - coin < 0)
                        continue;
                    // 状态转移方程：子问题中选择最优解，然后+1
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
            //
            return (dp[amount] == amount + 1) ? -1 : dp[amount];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}