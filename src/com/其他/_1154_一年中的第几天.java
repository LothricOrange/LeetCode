package com.其他;

public class _1154_一年中的第几天 {
    public int dayOfYear(String date) {
        String[] strs = date.split("-");
        int[] arr = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = 0;

        if (!strs[0].equals("1900") && Integer.parseInt(strs[0]) % 4 == 0) {
            arr[2] += 1;
        }
        for (int i = 0; i < Integer.parseInt(strs[1]); i++) {
            ans += arr[i];
        }
        return ans + Integer.parseInt(strs[2]);
    }
}
