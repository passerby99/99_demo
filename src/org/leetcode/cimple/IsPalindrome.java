package org.leetcode.cimple;

import org.junit.Test;

//  验证回文串
public class IsPalindrome {
    private boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        for (int i = 0; i < builder.length(); i++) {
            int ascii = builder.charAt(i);
            if (!(ascii >= 48 && ascii <= 57) && !(ascii >= 65 && ascii <= 90) && !(ascii >= 97 && ascii <= 122)) {
                builder.deleteCharAt(i);
                i--;
            }
        }
        String str1 = builder.toString();
        String str2 = builder.reverse().toString();
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }else {
            return false;
        }
    }


    @Test
    public void test() {
        String s = "a , , , 0 , , ";
        System.out.println(isPalindrome(s));
    }
}
