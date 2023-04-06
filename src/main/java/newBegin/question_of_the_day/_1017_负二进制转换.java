package newBegin.question_of_the_day;

public class _1017_负二进制转换 {
    public String baseNeg2(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; n > 0; i++) {
            sb.insert(0, n & 1);
            if ((i & 1) == 1) {
                n += (n & 1) << 1;
            }
            n >>= 1;
        }
        return sb.toString();
    }
}
