//假设你是一位顺风车司机，车上最初有 capacity 个空座位可以用来载客。由于道路的限制，车 只能 向一个方向行驶（也就是说，不允许掉头或改变方向，你可以
//将其想象为一个向量）。 
//
// 这儿有一份乘客行程计划表 trips[][]，其中 trips[i] = [num_passengers, start_location, end_
//location] 包含了第 i 组乘客的行程信息： 
//
// 
// 必须接送的乘客数量； 
// 乘客的上车地点； 
// 以及乘客的下车地点。 
// 
//
// 这些给出的地点位置是从你的 初始 出发位置向前行驶到这些地点所需的距离（它们一定在你的行驶方向上）。 
//
// 请你根据给出的行程计划表和车子的座位数，来判断你的车是否可以顺利完成接送所有乘客的任务（当且仅当你可以在所有给定的行程中接送所有乘客时，返回 true，否
//则请返回 false）。 
//
// 
//
// 示例 1： 
//
// 输入：trips = [[2,1,5],[3,3,7]], capacity = 4
//输出：false
// 
//
// 示例 2： 
//
// 输入：trips = [[2,1,5],[3,3,7]], capacity = 5
//输出：true
// 
//
// 示例 3： 
//
// 输入：trips = [[2,1,5],[3,5,7]], capacity = 3
//输出：true
// 
//
// 示例 4： 
//
// 输入：trips = [[3,2,7],[3,7,9],[8,3,9]], capacity = 11
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 你可以假设乘客会自觉遵守 “先下后上” 的良好素质 
// trips.length <= 1000 
// trips[i].length == 3 
// 1 <= trips[i][0] <= 100 
// 0 <= trips[i][1] < trips[i][2] <= 1000 
// 1 <= capacity <= 100000 
// 
// Related Topics 数组 前缀和 排序 模拟 堆（优先队列） 👍 145 👎 0


package leetcode.editor.cn;

public class CarPooling {
    public static void main(String[] args) {
        Solution solution = new CarPooling().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean carPooling(int[][] trips, int capacity) {
            // 最多有 1000 个⻋站
            int[] nums = new int[1001];
            // 构造差分数组
            Diff diff = new Diff(nums);
            for (int[] trip : trips) {
                int i = trip[1];
                // 第 trip[2] 站乘客已经下⻋，
                // 即乘客在⻋上的区间是 [trip[1], trip[2] - 1]
                int j = trip[2] - 1;
                int val = trip[0];
                // 进⾏区间操作
                diff.increament(i, j, val);
            }
            // 获得原始的数组
            int[] ans = new int[diff.result().length];
            ans = diff.result();
            // 判断超载
            for (int i : ans) {
                if (i > capacity)
                    return false;
            }
            return true;
        }
    }

    class Diff {
        private int[] diffNums;

        public Diff() {
        }

        public Diff(int[] nums) {
            assert nums.length != 0;
            diffNums = new int[nums.length];
            diffNums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diffNums[i] = nums[i] - nums[i - 1];
            }
        }

        public void increament(int i, int j, int val) {
            diffNums[i] += val;
            if (j + 1 < diffNums.length)
                diffNums[j + 1] -= val;
        }

        public int[] result() {
            int[] ans = new int[diffNums.length];
            ans[0] = diffNums[0];
            for (int i = 1; i < diffNums.length; i++) {
                ans[i] = ans[i - 1] + diffNums[i];
            }
            return ans;
        }

    }

//leetcode submit region end(Prohibit modification and deletion)

}