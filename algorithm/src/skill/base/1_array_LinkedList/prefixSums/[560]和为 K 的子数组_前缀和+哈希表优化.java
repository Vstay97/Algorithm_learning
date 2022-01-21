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
            // preSums == (key:前缀和,value: key对应的前缀和的个数)
            HashMap<Integer, Integer> preSums = new HashMap<Integer, Integer>();
            // 下标 0 之前没有元素，可以认为前缀和为 0，个数为 1 个
            preSums.put(0, 1);
            // preSums[i] - preSums[j] 出现的次数
            int count = 0;
            // 前缀和
            int sums = 0;
            /*
             * preSums[i] - preSums[j] == k    ==>     preSums[i] - k == preSums[j]
             * 1. 计算完包括了当前数前缀和
             * 2. 查一查在当前数之前，有多少个前缀和等于 preSum - k   ==> 查询preSums[j]的数量
             * 3. 维护 preSums的定义 (key:前缀和,value: key对应的前缀和的个数)
             * */

            for (int num : nums) {
                // 计算当前(i)的前缀和
                sums += num;

                // 先获得前缀和为 preSum - k 的个数，加到计数变量里
                if(preSums.containsKey(sums-k))
                    count += preSums.get(sums-k);

                // 获得指定前缀和,所对应的次数
                int times = preSums.getOrDefault(sums,0);

                // 维护preSums的定义
                preSums.put(sums,times+1);
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}