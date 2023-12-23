package org.leetcode.cimple;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        if(stringBuilder.length() == 0 || (stringBuilder.length() == 1 && stringBuilder.charAt(0) == ' ')) {
            return 0;
        }
        if(stringBuilder.length() == 1) {
            return 1;
        }
        stringBuilder.reverse();
        int i = 0;
        while (true){
            if(stringBuilder.charAt(i) == ' '){
                stringBuilder.deleteCharAt(i);
            } else {
                break;
            }
        }
        int index = stringBuilder.indexOf(" ");
        if(index == -1) {
           return stringBuilder.length();
        }
        String subString = stringBuilder.substring(0, index);
        return subString.length();
    }
}
