package com.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lc0290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result);
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] dict = new String[26];
        Arrays.fill(dict, null);
        int n = pattern.length();
        String[] carr = s.split(" ");
        Set<String> set = new HashSet<>();
        int k = carr.length;
        if (n != k)
            return false;
        for (int i = 0; i < k; i++) {
            int in = pattern.charAt(i % n) - 'a';
            if (dict[in] == null) {
                if (set.contains(carr[i]))
                    return false;
                dict[in] = carr[i];
                set.add(carr[i]);
            } else {
                if (!dict[in].equals(carr[i]))
                    return false;
            }
        }
        return true;
    }
}
