package newBegin.question_of_the_day;

public class _1053_交换一次的先前排列 {
    public int[] prevPermOpt1(int[] arr) {
        int min = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > min) {
                int j = i + 1;
                int index = j++;
                while (j < arr.length) {
                    if (arr[j] < arr[i] && arr[j] > min){
                        index = j;
                        j++;
                    }
                }
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
                return arr;
            }
        }
        return arr;
    }
}
