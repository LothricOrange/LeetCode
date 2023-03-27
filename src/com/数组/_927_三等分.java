package com.数组;

public class _927_三等分 {
    public int[] threeEqualParts(int[] arr) {
        int[] fail = new int[]{-1, -1};
        int count = 0;
        for (int a : arr) {
            if (a == 1) count++;
        }

        if (count == 0) return new int[]{0, 2};
        if (count % 3 != 0) return fail;
        
        int len = count / 3;

        int lastZero = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                lastZero++;
            } else {
                break;
            }
        }

        int[] res = new int[2];

        int tmp = len;
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                tmp--;
            }
            if (tmp == 0) {
                int needZero = lastZero;
                while (needZero != 0) {
                  needZero--;
                  i++;
                  if (arr[i] == 1) return fail;
                }
                lastIndex = i;
                break;
            }
        }

        res[0] = lastIndex;

        tmp = len;
        for (int i = lastIndex + 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                tmp--;
            }
            if (tmp == 0) {
                int needZero = lastZero;
                while (needZero != 0) {
                    needZero--;
                    i++;
                    if (arr[i] == 1) return fail;
                }
                lastIndex = i + 1;
                break;
            }
        }

        res[1] = lastIndex;

        StringBuilder sb1 = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i <= res[0]; i++) {
            if (arr[i] == 1) flag = true;
            if (flag) sb1.append(arr[i]);
        }

        StringBuilder sb2 = new StringBuilder();
        flag = false;
        for (int i = res[0] + 1; i < res[1]; i++) {
            if (arr[i] == 1) flag = true;
            if (flag) sb2.append(arr[i]);
        }

        StringBuilder sb3 = new StringBuilder();
        flag = false;
        for (int i = res[1]; i < arr.length; i++) {
            if (arr[i] == 1) flag = true;
            if (flag) sb3.append(arr[i]);
        }

        if (sb1.toString().equals(sb2.toString()) && sb1.toString().equals(sb3.toString())) return res;

        return fail;
    }
}
