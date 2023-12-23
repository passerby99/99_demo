package org.leetcode.cimple;
// 回文数
public class HuiWen {
    public static boolean isPalindrome(int x) {
        int number = x;
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            sb.append(number % 10);
            number = number / 10;
        }
        String str1 = sb.toString();
        String str = sb.reverse().toString();
        boolean n = str1.equals(str);
        return n;
    }
}
