package org.leetcode.cimple;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            char ch2;
            for (int j = 0; j < strs.length; j++) {
               try {
                   ch2 = strs[j].charAt(i);
               }catch (Exception e){
                   ch2 = 65;
               }

                if (ch  != ch2 && i == 0) {
                    return "";
                } else if (ch != ch2 && i != 0) {
                        return stringBuilder.toString();
                    }
                }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
