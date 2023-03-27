package leetCodeA.剑指Offer.第13天_双指针;

public class 剑指Offer58_I翻转单词顺序 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("")) continue;
            sb.append(strs[i].trim()).append(" ");
        }

        return sb.toString().trim();
    }
}
