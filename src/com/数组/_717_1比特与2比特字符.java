package com.数组;

public class _717_1比特与2比特字符 {
    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        boolean last = true;
        while (index < bits.length) {
            if (bits[index] == 1) {
                index += 2;
                last = false;
            } else {
                index++;
                last = true;
            }
        }

        return last;
    }
}
