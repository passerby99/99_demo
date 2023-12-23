package zheXian.leetCode.cimple;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int val = 0;
        int[] sum = new int[digits.length + 1];
        sum[0] = 1;
        int number = digits[digits.length - 1] + 1;
        if (number == 10) {
            val++;
            digits[digits.length - 1] = 0;
            int i = digits.length - 2;
            while (true) {

                if (i >= 0) {
                    number = digits[i] + val;
                    if (number == 10) {
                        digits[i] = 0;
                        i--;
                    } else {
                        digits[i] = number;
                        break;
                    }
                } else {
                    if(number == 10){
                        for (int j = 0; j < digits.length; j++) {
                            sum[j + 1] = digits[j];
                        }
                        return sum;

                    } else {
                        break;
                    }
                }
            }
        } else {
            digits[digits.length - 1] = number;
        }
        return digits;

    }
}
