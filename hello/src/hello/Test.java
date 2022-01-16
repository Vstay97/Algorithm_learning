package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums =new int[]{1,1,2};
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                // nums[i] == nums[j]
                if (nums[i] == nums[j])
                {
                    for(int k=j;k<nums.length;k++)
                        nums[k-1] = nums[k];
                }
        System.out.println(nums);
    }
}
