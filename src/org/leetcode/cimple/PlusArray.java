package org.leetcode.cimple;


public class PlusArray {



    public static String addArray(String num1, String num2) {
        String string;
        if (num1.length() > num2.length()) {
            string = getAnInt(num1, num2);
        } else {
            string = getAnInt(num2, num1);
        }
        return string;
    }


    private static  String getAnInt(String num1, String num2) {

        StringBuilder stringBuilder = new StringBuilder();
        int number1, number, add = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || add != 0) {
            if(i >= 0) {
                number = num1.charAt(i);
                number = number % 48;
            } else {
                number = 0;
            }
            if (j >= 0) {
                number1 = num2.charAt(j);
                number1 = number1 % 48;

            } else {
                number1 = 0;
            }
            i--;
            j--;
            add = number + number1 + add;
            int sum1 = add % 10;
            add = add / 10;
            stringBuilder.append(sum1);
        }
        stringBuilder.reverse();
        String string = stringBuilder.toString();
        return string;
    }

}