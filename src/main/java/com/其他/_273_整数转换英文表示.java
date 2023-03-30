package com.其他;

public class _273_整数转换英文表示 {
    String[] low = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] mid = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] high = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        int part1 = num % 1000;
        num = num / 1000;
        int part2 = num % 1000;
        num = num / 1000;
        int part3 = num % 1000;
        num = num / 1000;
        int part4 = num;
        StringBuilder sb = new StringBuilder();
        if (part4 != 0) {
            sb.append(buildNumber(part4)).append("Billion ");
        }
        if (part3 != 0) {
            sb.append(buildNumber(part3)).append("Million ");
        }
        if (part2 != 0) {
            sb.append(buildNumber(part2)).append("Thousand ");
        }
        if (part1 != 0) {
            sb.append(buildNumber(part1));
        }
        return sb.toString().trim();
    }

    private String buildNumber(int num) {
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int c = num;
        StringBuilder sb = new StringBuilder();
        if (c != 0) sb.append(low[c]).append(" Hundred ");
        if (b == 1) {
            sb.append(mid[a]);
        } else if (b == 0) {
            sb.append(low[a]);
        } else {
            sb.append(high[b] + " " + low[a]);
        }
        return sb.toString().trim() + " ";
    }


}
