package QuestionTemp.leetcode.editor.cn;//给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的
// 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。 
//
// candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
//
// 对于给定的输入，保证和为 target 的不同组合数少于 150 个。 
//
// 
//
// 示例 1： 
//
// 
//输入：candidates = [2,3,6,7], target = 7
//输出：[[2,2,3],[7]]
//解释：
//2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
//7 也是一个候选， 7 = 7 。
//仅有这两种组合。 
//
// 示例 2： 
//
// 
//输入: candidates = [2,3,5], target = 8
//输出: [[2,2,2,2],[2,3,3],[3,5]] 
//
// 示例 3： 
//
// 
//输入: candidates = [2], target = 1
//输出: []
// 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都 互不相同 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯 👍 2044 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 定义路径之和
    int trackSum = 0;
    // 定义结果集
    List<List<Integer>> res = new LinkedList<>();
    // 定义路径集
    LinkedList track = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, 0, target);
        return res;
    }

    void backTrack(int[] nums, int start, int target) {
        // base case : 找到目标和，记录结果
        // 符合路径的条件 : 路径之和等于target
        if (trackSum == target) {
            res.add(new LinkedList<>(track));
            return;
        }
        // base case : 超过目标和，停止向下遍历
        // 结束的条件 : 路径之和大于target(就没有再加的必要了)
        if (trackSum > target)
            return;
        for (int i = start; i < nums.length; i++) {
            // 这两句都属于是 { 选择nums[i] }
            trackSum += nums[i];
            track.add(nums[i]);
            /**
             * 标准的子集/组合问题是如何保证不重复使用元素的？
             * 答: 在于 backtrack 递归时输入的参数 start
             *     backtrack(nums, i + 1);
             *     这个 i 从 start 开始
             *     那么下一层回溯树就是从 start + 1 开始
             *     从而保证 nums[start] 这个元素不会被重复使用
             *
             *     那么反过来，如果我想让每个元素被重复使用
             *     只需 i + 1 改成 i 即可
             */
            backTrack(nums, i, target);
            // 下面两句都属于 { 撤销选择 }
            trackSum -= nums[i];
            track.removeLast();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
