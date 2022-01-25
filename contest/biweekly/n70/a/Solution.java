package com.contest.biweekly.n70.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int minimumCost(int[] cost) {
        List<Integer> list = new ArrayList<>();
        for (int c : cost) list.add(c);
        Collections.sort(list, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) % 3 == 0)
                continue;
            else
                ans += list.get(i);
        }
        return ans;
    }
}
