//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。 
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
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
// nums 中的所有元素 互不相同 
// 
// Related Topics 位运算 数组 回溯 👍 1657 👎 0


package QuestionTemp.leetcode.editor.cn;

public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();
        // 记录回溯算法的递归路径
        LinkedList<Integer> track = new LinkedList<>();

        public List<List<Integer>> subsets(int[] nums) {
            backtrack(nums,0);
            return res;
        }
        // 回溯算法核心函数，遍历子集问题的回溯树
        public void backtrack(int[] nums,int start){
            // 前序位置，每个节点的值都是一个子集
            res.add(new LinkedList<>(track));

            for (int i =start;i<nums.length;i++){
                track.addLast(nums[i]);
                backtrack(nums,i+1);
                track.removeLast();
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}