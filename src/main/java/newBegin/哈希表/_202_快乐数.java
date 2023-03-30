package newBegin.哈希表;

import java.util.HashSet;
import java.util.Set;

public class _202_快乐数 {

    //方法2
    public boolean isHappyII(int n) {
        do {
            int sum = 0;
            while (n != 0) {
                int tmp = n % 10;
                sum += tmp * tmp;
                n /= 10;
            }
            n = sum;
        } while (n >= 10);
        return n == 1 || n == 7;
    }


    //方法1
    public boolean isHappyI(int n) {
        if (n == 1 || n == 7) return true;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while (true) {
            sum = getSum(n);
            if (sum == 1) return true;
            if (set.contains(sum)) return false;
            set.add(sum);
            n = sum;
        }
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}
