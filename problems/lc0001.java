package com.problems;

import com.helpers.Input;
import com.helpers.Output;

import java.util.HashMap;
import java.util.Map;

public class lc0001 {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        int[] nums = input.inputIntegerArray();
        int target = 9;
        int[] result = twoSum(nums, target);
        output.outputIntegerArray(result);
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[] {i, map.get(diff)};
            }
        }
        return new int[] {};
    }
}
