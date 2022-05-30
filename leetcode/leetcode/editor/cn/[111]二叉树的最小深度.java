//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明：叶子节点是指没有子节点的节点。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：root = [2,null,3,null,4,null,5,null,6]
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数的范围在 [0, 10⁵] 内 
// -1000 <= Node.val <= 1000 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 767 👎 0

  
package QuestionTemp.leetcode.editor.cn;

public class MinimumDepthOfBinaryTree{
    public static void main(String[] args) {
        Solution solution = new MinimumDepthOfBinaryTree().new Solution();
       
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // // 计算从起点 start 到终点 target 的最近距离
    // int BFS(Node start, Node target) {
    //     Queue<Node> q; // 核心数据结构
    //     Set<Node> visited; // 避免走回头路
    //
    //     q.offer(start); // 将起点加入队列
    //     visited.add(start);
    //     int step = 0; // 记录扩散的步数
    //
    //     while (q not empty) {
    //         int sz = q.size();
    //         /* 将当前队列中的所有节点向四周扩散 */
    //         for (int i = 0; i < sz; i++) {
    //             Node cur = q.poll();
    //             /* 划重点：这里判断是否到达终点 */
    //             if (cur is target)
    //                 return step;
    //             /* 将 cur 的相邻节点加入队列 */
    //             for (Node x : cur.adj()) {
    //                 if (x not in visited) {
    //                     q.offer(x);
    //                     visited.add(x);
    //                 }
    //             }
    //         }
    //         /* 划重点：更新步数在这里 */
    //         step++;
    //     }
    // }


    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        // 核心数据结构
        Queue<TreeNode> q = new ArrayDeque<>();
        // 将起点加入队列
        q.offer(root);
        // root 本身就是一层，初始化为 1
        int step = 1;

        // 控制一层一层遍历
        while(!q.isEmpty()){
            int sz = q.size();
            // 控制每层从左往右遍历
            for (int i=0;i<sz;i++){
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right==null)
                    return step;
                else if (cur.left != null){
                    q.offer(cur.left);
                }
                if (cur.right != null){
                    q.offer(cur.right);
                }
            }
            step++;
        }
        return step;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}