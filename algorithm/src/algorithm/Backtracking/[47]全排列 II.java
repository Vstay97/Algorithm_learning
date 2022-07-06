package QuestionTemp.leetcode.editor.cn;//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics 数组 回溯 👍 1109 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 定义结果集
    List<List<Integer>> res = new LinkedList<>();
    // 定义路径集
    LinkedList<Integer> track = new LinkedList<>();
    // 定义该结点是否访问过
    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums);
        return res;
    }

    void backTrack(int[] nums) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // 如果这个节点访问过, 那就跳过
            if (used[i])
                continue;
            // 如果这个节点没访问过, 并且和之前的一样 那就跳过
            // used[i-1] == false 是因为: 在回退的过程中被撤销了选择
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            track.addLast(nums[i]);
            backTrack(nums);
            used[i] = false;
            track.removeLast();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
