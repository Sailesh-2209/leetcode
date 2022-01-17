package com.helpers;

public class Output {
    public void outputIntegerArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", nums[i]);
        System.out.println();
    }
    public void outputStringArray(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.printf("%s ", arr[i]);
        System.out.println();
    }
}
