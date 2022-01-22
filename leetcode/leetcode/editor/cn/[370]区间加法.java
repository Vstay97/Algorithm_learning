//假设你有一个长度为 n 的数组，初始情况下所有的数字均为 0，你将会被给出 k 个更新的操作。 
//
// 其中，每个操作会被表示为一个三元组：[startIndex, endIndex, inc]，你需要将子数组 A[startIndex ... 
//endIndex]（包括 startIndex 和 endIndex）增加 inc。 
//
// 请你返回 k 次操作后的数组。 
//
// 示例: 
//
// 输入: length = 5, updates = [[1,3,2],[2,4,3],[0,2,-2]]
//输出: [-2,0,3,5,3]
// 
//
// 解释: 
//
// 初始状态:
//[0,0,0,0,0]
//
//进行了操作 [1,3,2] 后的状态:
//[0,2,2,2,0]
//
//进行了操作 [2,4,3] 后的状态:
//[0,2,5,5,3]
//
//进行了操作 [0,2,-2] 后的状态:
//[-2,0,3,5,3]
// 
// Related Topics 数组 前缀和 👍 104 👎 0


//模板:
//public class Test_ {
//    public static void main(String[] args) {
//        int length = 5;
//        int[] nums = new int[length];
//        int[][] updates = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};
//
//        Diff diff = new Diff(nums);
//
//        for (int[] i : updates) {
//            diff.increment(i[0], i[1], i[2]);
//            System.out.println(Arrays.toString(diff.result()));
//        }
//
//    }
//}
//
//class Solution {
//    public int[] getModifiedArray(int length, int[][] updates) {
//        int[] nums = new int[length];
//        int ans[] = new int[length];
//        Diff diff = new Diff(nums);
//        for (int[] i : updates) {
//            diff.increment(i[0], i[1], i[2]);
//            ans = diff.result();
//        }
//        return ans;
//    }
//}
//
//class Diff {
//    // 差分数组
//    private int[] diffNums;
//
//    public Diff() {
//    }
//
//    // 差分数组的构造函数
//    //输⼊⼀个初始数组，区间操作将在这个数组上进⾏
//    public Diff(int[] nums) {
//        diffNums = new int[nums.length];
//        diffNums[0] = nums[0];
//        // 根据初始数组, 构造差分数组
//        for (int i = 1; i < nums.length; i++) {
//            diffNums[i] = nums[i] - nums[i - 1];
//        }
//    }
//
//    // 给闭区间 [i,j] 增加 val（可以是负数）
//    public void increment(int i, int j, int val) {
//        diffNums[i] += val;
//        if (j + 1 < diffNums.length)
//            diffNums[j + 1] -= val;
//    }
//
//    // 返回结果数组
//    public int[] result() {
//        int[] res = new int[diffNums.length];
//        res[0] = diffNums[0];
//        // 返回结果数组
//        for (int i = 1; i < diffNums.length; i++) {
//            res[i] = res[i - 1] + diffNums[i];
//        }
//        return res;
//    }
//}

package leetcode.editor.cn;

public class RangeAddition {
    public static void main(String[] args) {
        Solution solution = new RangeAddition().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int[] getModifiedArray(int length, int[][] updates) {
            int[] nums = new int[length];
            int ans[] = new int[length];
            Diff diff = new Diff(nums);
            for (int[] i : updates) {
                diff.increment(i[0], i[1], i[2]);
                ans = diff.result();
            }
            return ans;
        }
    }
    class Diff {
        private int[] diff;

        public Diff() {
        }

        // 初始化
        public Diff(int[] nums) {
            diff = new int[nums.length];
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        // 增加
        public void increment(int i, int j, int val) {
            diff[i] += val;
            if (j+1 < diff.length)
                diff[j+1] -= val;
        }

        // 输出结果
        public int[] result(){
            int[] ans = new int[diff.length];
            ans[0] = diff[0];
            for (int i=1;i<diff.length;i++){
                ans [i] = ans[i-1]+diff[i];
            }
            return ans;
        }
    }




//leetcode submit region end(Prohibit modification and deletion)

}