package com.contest.weekly.n276.a;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i += k) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                sb.append((i + j) < n ? s.charAt(i + j) : fill);
            }
            list.add(sb.toString());
        }
        int sz = list.size();
        String[] result = new String[sz];
        for (int i = 0; i < sz; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
