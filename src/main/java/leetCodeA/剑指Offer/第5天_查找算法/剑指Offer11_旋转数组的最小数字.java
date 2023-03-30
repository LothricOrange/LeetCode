package leetCodeA.剑指Offer.第5天_查找算法;

public class 剑指Offer11_旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int middle = (left + right) >> 1;
            if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            } else if (numbers[middle] < numbers[right]) {
                right = middle;
            } else {
                right--;
            }
        }
        return numbers[right];
    }

    public int minArray2(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i-1]) return numbers[i];
        }
        return numbers[0];
    }
}
