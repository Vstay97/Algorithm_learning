package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        for(int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++)
            {
                if (nums[i]+nums[j] == target)
                    System.out.println(""+i+""+j);
            }
        }
    }
}
