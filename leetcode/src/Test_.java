import java.util.ArrayList;
import java.util.List;

/**
 * @author Vstay
 * @date 2022/1/20 11:35
 */
public class Test_ {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int k = 0;
        System.out.println(Test_.subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int ans = 0;


        int[] preSums = new int[nums.length + 1];
        for (int i = 1; i < preSums.length; i++) {
            preSums[i] = preSums[i - 1] + nums[i - 1];
        }
        for (int i = preSums.length - 1; i > 0; i--) {
            for (int j = 0; j < preSums.length; j++) {
                if ((preSums[i] - preSums[j]) == k)
                    ans += 1;
            }
        }
        return ans;

    }
}
