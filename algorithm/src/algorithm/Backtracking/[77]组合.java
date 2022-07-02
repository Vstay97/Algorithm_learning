package QuestionTemp.leetcode.editor.cn;//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
// Related Topics 回溯 👍 1031 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList track = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        // 多了一个参数k:用来控制结束条件
        backTrack(n, k, 1);
        return res;
    }

    void backTrack(int n, int k, int start) {
        // 终结条件就是: track数组的长度达到了k
        if (track.size() == k) {
            res.add(new ArrayList<>(track));
            return;
        }
        // 回溯算法标准框架
        for (int i = start; i <= n; i++) {
            // 选择
            track.addLast(i);
            // 通过 start 参数控制树枝的遍历，避免产生重复的子集
            backTrack(n, k, i + 1);
            // 撤销选择
            track.removeLast();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
