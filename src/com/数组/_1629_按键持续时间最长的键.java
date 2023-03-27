package com.数组;

import java.util.HashMap;

public class _1629_按键持续时间最长的键 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char res = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int val = releaseTimes[i] - releaseTimes[i - 1];
            if (val < max) continue;
            char c = keysPressed.charAt(i);
            if (val > max) {
                max = val;
                res = c;
            } else {
                res = res > c ? res : c;
            }

        }

        return res;
    }

    public char slowestKey2(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(releaseTimes[0], keysPressed.charAt(0));
        for (int i = 1; i < releaseTimes.length; i++) {
            int val = releaseTimes[i] - releaseTimes[i - 1];
            max = Math.max(max, val);
            char c = keysPressed.charAt(i);
            if (map.containsKey(val) && map.get(val) > c) {
            } else {
                map.put(val, c);
            }


        }
        return map.get(max);
    }
}
