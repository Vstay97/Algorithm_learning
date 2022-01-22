//给定一个整数数组 nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。 
//
// 
// 
// 实现 NumArray 类： 
//
// 
// NumArray(int[] nums) 使用数组 nums 初始化对象 
// int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 
//sum(nums[i], nums[i + 1], ... , nums[j])） 
// 
//
// 
//
// 示例： 
//
// 
//输入：
//["NumArray", "sumRange", "sumRange", "sumRange"]
//[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
//输出：
//[null, 1, -1, -3]
//
//解释：
//NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
//numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
//numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1)) 
//numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁴ 
// -10⁵ <= nums[i] <= 10⁵ 
// 0 <= i <= j < nums.length 
// 最多调用 10⁴ 次 sumRange 方法 
// 
// 
// 
// Related Topics 设计 数组 前缀和 👍 411 👎 0

/*
* 一维数组中的前缀和
* */

//class NumArray {
//    // 前缀和数组
//    private int[] preSum;
//    /* 输⼊⼀个数组，构造前缀和 */
//    public NumArray(int[] nums) {
//        // preSum[0] = 0，便于计算累加和
//        preSum = new int[nums.length + 1];
//        // 计算 nums 的累加和
//        for (int i = 1; i < preSum.length; i++) {
//            preSum[i] = preSum[i - 1] + nums[i - 1];
//        }
//    }
//
//    /* 查询闭区间 [left, right] 的累加和 */
//    public int sumRange(int left, int right) {
//        return preSum[right + 1] - preSum[left];
//    }
//}

package skill.base;
public class RangeSumQueryImmutable{
    public static void main(String[] args) {
         Solution solution = new RangeSumQueryImmutable().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
   class NumArray {
        private int[] preSum;
        public NumArray(int[] nums) {
            preSum = new int[nums.length+1];
            preSum[0] = 0;
            for (int i =1;i<preSum.length;i++){
                preSum[i] = preSum[i-1]+nums[i-1];
            }
        }

        public int sumRange(int left, int right) {
            return preSum[right+1] - preSum[left];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
//leetcode submit region end(Prohibit modification and deletion)

}