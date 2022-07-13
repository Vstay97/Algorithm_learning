package 代码随想录//给定一个含有 n 个正整数的数组和一个正整数 target 。
//
// 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长
//度。如果不存在符合条件的子数组，返回 0 。
//
//
//
// 示例 1：
//
//
//输入：target = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。
//
//
// 示例 2：
//
//
//输入：target = 4, nums = [1,4,4]
//输出：1
//
//
// 示例 3：
//
//
//输入：target = 11, nums = [1,1,1,1,1,1,1,1]
//输出：0
//
//
//
//
// 提示：
//
//
// 1 <= target <= 10⁹
// 1 <= nums.length <= 10⁵
// 1 <= nums[i] <= 10⁵
//
//
//
//
// 进阶：
//
//
// 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。
//
// Related Topics 数组 二分查找 前缀和 滑动窗口 👍 1243 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 滑动窗口
     * 只用一个for循环，那么这个循环的索引，一定是表示 滑动窗口的终止位置(end)
     * 滑动窗口，主要确定如下三点：
     * 窗口内是什么？
     * 如何移动窗口的起始位置？
     * 如何移动窗口的结束位置？
     * 解答:
     * 窗口: 满足其和 ≥ s 的长度最小的 连续 子数组
     * 窗口的起始位置如何移动：如果当前窗口的值大于s了，窗口就要向前移动了（也就是该缩小了）
     * 窗口的结束位置如何移动：窗口的结束位置就是遍历数组的指针，也就是for循环里的索引。
     */
    public int minSubArrayLen(int target, int[] nums) {
        // 数组的和
        int sum = 0;
        // 返回的数组长度, 初始化为一个最大值
        int res = Integer.MAX_VALUE;
        // 滑动窗口的起始位置
        int start = 0;
        // 滑动窗口的结束位置
        int end = 0;

        // 循环的索引就是滑动窗口的终止位置(end)
        for (; end < nums.length; end++) {
            // 当前遍历到的数组的和
            sum += nums[end];
            // 注意这里使用while，每次更新 start（起始位置），并不断比较子序列是否符合条件
            while (sum >= target) {
                // 数组的长度是: end - start + 1
                res = Math.min(res, end - start + 1);
                // 这里体现出滑动窗口的精髓之处:
                // 窗口在缩小, 配合之前的 while 来判定最小的窗口
                sum -= nums[start++];
            }
        }

        // 如果没有匹配到,就返回 0
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
