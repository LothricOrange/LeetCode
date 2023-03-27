package leetCodeA.数据结构基础.第6天_字符串;

public class _415_字符串相加 {
    public String addStrings(String num1, String num2) {
        int value = 0;
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while ((index1 >= 0) || (index2 >= 0) || (value != 0)) {
            if (index1 >= 0) value += num1.charAt(index1) - '0';
            index1--;
            if (index2 >= 0) value += num2.charAt(index2) - '0';
            index2--;
            sb.append(value % 10);
            value /= 10;
        }
        return sb.reverse().toString();
    }
}
