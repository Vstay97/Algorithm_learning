package QuestionTemp.leetcode.editor.cn;//给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
//
// 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。 
//
// 
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2]
//输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[[],[0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// 
// 
// 
// Related Topics 位运算 数组 回溯 👍 868 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 定义结果集
    List<List<Integer>> res = new LinkedList<>();
    // 定义路径
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // 去重的关键是要先排序
        Arrays.sort(nums);
        backTrack(nums, 0);
        return res;
    }

    void backTrack(int[] nums, int start) {
        res.add(new LinkedList<>(track));

        if (start >= nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // 这里的 i>start, 是为了避免 i==0 的情况
            // nums[i] == nums[i-1] : 同一树层上的“使用过”的值去重
            if (i > start && nums[i] == nums[i - 1])
                continue;
            track.addLast(nums[i]);
            backTrack(nums, i + 1);
            // 这里注意要用removeLast(),而不是remove()
            track.removeLast();
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
