package com.哈希表;

import java.util.HashSet;
import java.util.Set;

public class _929_独特的电子邮件地址 {
    public int numUniqueEmails(String[] emails) {
        int count = 0;
        Set<String> setForUser = new HashSet<>();
        Set<String> setForDomain = new HashSet<>();
        for (String email : emails) {
            String[] userAndDomain = email.split("@");
            boolean flag = true;
            if (!setForDomain.contains(userAndDomain[1])) {
                setForDomain.add(userAndDomain[1]);
                count++;
                flag = false;
            }

            StringBuilder userName = new StringBuilder();
            char[] chars = userAndDomain[0].toCharArray();
            for (char c : chars) {
                if (c == '.') continue;
                if (c == '+') break;
                userName.append(c);
            }

            String str = userName.toString();
            if (!setForUser.contains(str)) {
                setForUser.add(str);
                if (flag) count++;
            }

        }

        return count;
    }
}
