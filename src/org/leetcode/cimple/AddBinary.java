package org.leetcode.cimple;

public class AddBinary {
    public String addBinary(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int max = Math.max(a.length(), b.length());
        String minStr;
        char value = '0';
        StringBuilder maxStr = new StringBuilder();
        if (a.length() == min) {
            maxStr.append(b);
            minStr = a;
        } else {
            maxStr.append(a);
            minStr = b;
        }
        max--;
        min--;
        while (true) {
            if (min >= 0) {
                char chOne = maxStr.charAt(max);
                char chTwo = minStr.charAt(min);
                if (chOne == '0' && chTwo == '0' && value == '0') {
                    maxStr.setCharAt(max, '0');
                } else if (chOne == '0' && chTwo == '0' && value == '1') {
                    maxStr.setCharAt(max, '1');
                    value = '0';
                } else if (chOne != chTwo && value == '0') {
                    maxStr.setCharAt(max, '1');
                } else if (chOne != chTwo && value == '1') {
                    maxStr.setCharAt(max, '0');
                } else if (chOne == '1' && chTwo == '1' && value == '0') {
                    maxStr.setCharAt(max, '0');
                    value = '1';
                } else if (chOne == '1' && chTwo == '1' && value == '1') {
                    maxStr.setCharAt(max, '1');
                }

            } else {
                if (max >= 0) {
                    if (value != '0' && maxStr.charAt(max) == '1') {
                        maxStr.setCharAt(max, '0');
                    } else if (value != '0' && maxStr.charAt(max) == '0') {
                        maxStr.setCharAt(max, '1');
                        value = '0';
                    } else if (value == '0') {
                        break;
                    }
                } else {
                    if(value != '0') {
                        maxStr.insert(0,'1');

                    }
                    break;
                }

            }
            min--;
            max--;

        }

        return maxStr.toString();
    }
}
