package indi.tudan.learn.leetcode._1_twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author wangtan
 * @date 2020-05-08 14:06:16
 * @since 1.0
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>((int) ((float) nums.length / 0.75F + 1.0F));
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum value");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
