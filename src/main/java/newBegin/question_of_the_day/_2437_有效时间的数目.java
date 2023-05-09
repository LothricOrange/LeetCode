package newBegin.question_of_the_day;

public class _2437_有效时间的数目 {
    public int countTime(String time) {
        char[] chars = time.toCharArray();
        int res = 1;
        int h1 = chars[0] == '?' ? -1 : (chars[0] - '0');
        int h2 = chars[1] == '?' ? -1 : (chars[1] - '0');
        int m1 = chars[3] == '?' ? -1 : (chars[3] - '0');
        int m2 = chars[4] == '?' ? -1 : (chars[4] - '0');
        if (h1 == -1) {
            if (h2 == -1) {
                res = 24;
            } else {
                res = (h2 < 4) ? 3 : 2;
            }
        } else if (h2 == -1){
            res = (h1 < 2) ? 10 : 4;
        }

        if (m1 == -1) {
            res = m2 == -1 ? res * 60 : res * 6;
        } else if (m2 == -1) {
            res = res * 10;
        }

        return res;
    }
}
