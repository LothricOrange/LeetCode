package com.正则;

public class _468_验证IP地址 {
    public String validIPAddress(String queryIP) {
        if (queryIP == null) return "Neither";

        String regex0 = "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
        String regexIPv4 = regex0 + "(\\." + regex0 + "){3}";
        String regex1 = "([\\da-fA-F]{1,4})";
        String regexIPv6 = regex1 + "(:" + regex1 + "){7}";

        String result = "Neither";
        if (queryIP.matches(regexIPv4)) {
            result = "IPv4";
        } else if (queryIP.matches(regexIPv6)) {
            result = "IPv6";
        }
        return result;
    }
}
