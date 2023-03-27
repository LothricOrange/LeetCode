package leetCodeA.剑指Offer.第3天_字符串;

public class 剑指Offer05_替换空格 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}
