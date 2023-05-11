package newBegin.数组;

import java.util.Random;

public class _384_打乱数组 {
    int[] newArray;
    int[] oldArray;
    Random rnd = new Random();
    public _384_打乱数组(int[] nums) {
        newArray = nums;
        oldArray = newArray.clone();
    }

    public int[] reset() {
        return oldArray;
    }

    public int[] shuffle() {
        newArray = oldArray.clone();
        for (int i = newArray.length; i > 1; i--) {
            swap(i-1, rnd.nextInt(i));
        }
        return newArray;
    }

    public void swap(int a, int b) {
        int temp = newArray[a];
        newArray[a] = newArray[b];
        newArray[b] = temp;
    }
}
