package newBegin.question_of_the_day;

public class _2427_公因子的数目 {
    public int commonFactors(int a, int b) {
        int min = a < b ? a : b;
        int count = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }
}
