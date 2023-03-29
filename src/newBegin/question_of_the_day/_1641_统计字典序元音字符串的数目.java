package newBegin.question_of_the_day;

public class _1641_统计字典序元音字符串的数目 {
    public int countVowelStrings(int n) {
        //c(n + 4, 4)
        return (n + 4) * (n + 3) * (n + 2) * (n + 1) * n / 24;
    }
}
