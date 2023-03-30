package zs.szs85;

public class _6156_得到K个黑块的最少涂色次数 {
    public int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int index = 0;
        int needBlack;
        int needChange = 0;
        int res = Integer.MAX_VALUE;
        char old = ' ';
        while (index < chars.length) {
            if (chars[index] == 'B') {
                if (old == 'B') {
                    needBlack = k - 1;
                    if (needBlack <= 0) return 0;
                } else {
                    needBlack = k;
                }

                int tmpIndex = index + 1;
                while (tmpIndex < chars.length) {
                    if (chars[tmpIndex] == 'W') {
                        needChange++;
                    }
                    needBlack--;
                    tmpIndex++;
                    if (needBlack == 0) break;
                }
                res = Math.min(res, needChange);
            }
            index++;
        }
        return res;
    }
}
