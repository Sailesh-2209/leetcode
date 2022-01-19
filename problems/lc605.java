package com.problems;

import com.helpers.Input;

public class lc605 {
    public static void main(String[] args) {
        Input input = new Input();
        int[] flowerbed = input.inputIntegerArray();
        int n = 1;
        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            boolean flag1 = flowerbed[i] == 0;
            boolean flag2 = ((i - 1 >= 0) ? flowerbed[i - 1] : 0) == 0;
            boolean flag3 = ((i + 1 < len) ? flowerbed[i + 1] : 0) == 0;
            if (flag1 && flag2 && flag3) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
