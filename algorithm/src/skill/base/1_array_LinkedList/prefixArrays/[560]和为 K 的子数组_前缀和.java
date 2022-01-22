//给你一个整数数组 nums 和一个整数 k ，请你统计并返回该数组中和为 k 的连续子数组的个数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,1], k = 2
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3], k = 3
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -1000 <= nums[i] <= 1000 
// -10⁷ <= k <= 10⁷ 
// 
// Related Topics 数组 哈希表 前缀和 👍 1275 👎 0

/*
* 普通前缀和技巧
* */
package leetcode.editor.cn;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int ans = 0;
            // 构造前缀和
            int[] preSums = new int[nums.length + 1];
            for (int i = 1; i < preSums.length; i++) {
                preSums[i] = preSums[i - 1] + nums[i - 1];
            }
            // 进行穷举
            for (int i=1;i<preSums.length;i++)
                for(int j =0;j<i;j++){
                    // 数组 nums[j,...,i-1] 的元素和
                    if(preSums[i] - preSums[j] == k)
                        ans += 1;
                }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}