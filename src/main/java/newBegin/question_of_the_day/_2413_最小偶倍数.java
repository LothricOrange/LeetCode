package newBegin.question_of_the_day;

public class _2413_最小偶倍数 {
    public int smallestEvenMultiple(int n) {
        return (n & 1) == 0 ? n : n << 1;
    }
}
