package org.leetcode.cimple;
// 罗马数字转正数
public class LuoMa {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int index2;
        for (int i = s.length() - 1; i >= 0; i--) {
            int index1 = s.charAt(i);
            if(i - 1 >= 0){
                index2 = s.charAt(i - 1);
            }else{
               index2 = 0;
            }
            int number1 = number(index1);
            System.out.println("number1 = " + number1);
            int number2 = number(index2);
            System.out.println("number2 = " + number2);
            if(number1 <= number2){
               sum = sum + number1;
            }else{
                sum = sum + (number1 - number2);
                i--;
            }
            System.out.println("sum = " + sum);
        }
        return 0;
    }
    public static int number(int number){
        int[] arr = new int[90];
        arr[73] = 1;
        arr[86] = 5;
        arr[88] = 10;
        arr[76] = 50;
        arr[67] = 100;
        arr[68] = 500;
        arr[77] = 1000;
       return arr[number];
    }
}
