package com.其他;

import java.util.Set;
import java.util.TreeSet;

public class _729_我的日程安排表I {
    private Set<int[]> set;
    public _729_我的日程安排表I() {
        set = new TreeSet<>((a, b) -> {
            if (a[0] >= b[1]) {
                return 1;
            } else if (a[1] <= b[0]) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    public boolean book(int start, int end) {

        return set.add(new int[]{start, end});
    }
}
