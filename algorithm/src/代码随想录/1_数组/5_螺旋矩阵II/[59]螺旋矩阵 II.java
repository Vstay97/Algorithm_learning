package 代码随想录//给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
//
//
//
// 示例 1：
//
//
//输入：n = 3
//输出：[[1,2,3],[8,9,4],[7,6,5]]
//
//
// 示例 2：
//
//
//输入：n = 1
//输出：[[1]]
//
//
//
//
// 提示：
//
//
// 1 <= n <= 20
//
// Related Topics 数组 矩阵 模拟 👍 761 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     *  模拟 : 就是模拟手动填入的过程, 一定要细心注意边界条件和遍历的索引方向
     *  当 num <= n*n 时:
     *      始终按照 从左到右 从上到下 从右到左 从下到上 填入顺序循环.
     *      每次填入后：
     *          执行 num += 1：得到下一个需要填入的数字；
 *          更新边界：例如从左到右填完后，上边界 t += 1，相当于上边界向内缩 1。(不要每次填完就缩!!!)
     */
    public int[][] generateMatrix(int n) {
        // 定义结果的数组
        int[][] res = new int[n][n];
        // 定义开始的初始数字: 1
        int num = 1;
        /**
         * left, right, top, bottom : 分别代表四个边界
         */
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        while (num <= n * n) {
            // 上边界 : 从左到右遍历, 结束后到了右边. 上边界下降
            for (int i = left; i <= right; i++)
                res[top][i] = num++;
            top++;
            // 右边界 : 从上到下遍历, 结束后到了下边. 右边界左移
            for (int i = top; i <= bottom; i++)
                res[i][right] = num++;
            right--;
            // 下边界: 从右到左遍历, 结束后到了左边. 下边界上升
            for (int i = right; i >= left; i--)
                res[bottom][i] = num++;
            bottom--;

            // 左边界: 从下向上遍历, 结束就没有了. 左边界右移
            for (int i = bottom; i >= top; i--)
                res[i][left] = num++;
            left++;

        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
