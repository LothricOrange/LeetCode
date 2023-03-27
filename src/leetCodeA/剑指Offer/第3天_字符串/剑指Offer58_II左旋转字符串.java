package leetCodeA.剑指Offer.第3天_字符串;

public class 剑指Offer58_II左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        String str1 = s.substring(0, n);
        String str2 = s.substring(n);
        return str2 + str1;
    }

    public String reverseLeftWords2(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = n; i < len; i++) {
            sb.append(s.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
