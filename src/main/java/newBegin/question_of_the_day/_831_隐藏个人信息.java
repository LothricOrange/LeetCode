package newBegin.question_of_the_day;

public class _831_隐藏个人信息 {
    public String maskPII(String s) {
        char[] chars = s.toCharArray();
        boolean isPhone = chars[0] <= '9';
        StringBuffer sb = new StringBuffer();
        int i;
        if (isPhone) {
            int size = 0;
            byte[] arr = new byte[chars.length];
            for (i = 0; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    arr[size] = (byte) (chars[i] - '0');
                    size++;
                }
            }
            if (size == 10) {
                sb.append("***-***-");
            } else if (size == 11) {
                sb.append("+*-***-***-");
            } else if (size == 12) {
                sb.append("+**-***-***-");
            } else if (size == 13) {
                sb.append("+***-***-***-");
            }
            for (int j = size - 4; j < size; j++) {
                sb.append(arr[j]);
            }
        } else {
            for (i = 1; i < chars.length; i++) {
                if (chars[i] == '@') break;
            }
            char firstLetter = chars[0] >= 'a' ? chars[0] : (char)(chars[0] + 32);
            int index = i - 1;
            char lastLetter = chars[index] >= 'a' ? chars[index] : (char)(chars[index] + 32);
            sb.append(firstLetter + "*****" + lastLetter + "@");
            i++;
            for (; i < chars.length; i++) {
                if (chars[i] >= 'a' || chars[i] == '.') {
                    sb.append(chars[i]);
                } else {
                    sb.append((char)(chars[i] + 32));
                }
            }
        }
        return sb.toString();
    }
}
