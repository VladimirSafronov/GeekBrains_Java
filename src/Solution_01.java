/*Попробовать сгенерировать все перестановки длины N из K чисел с повторениями.
Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"
 */


import java.util.Arrays;

public class Solution_01 {

    public static int findMax(int length, int count) throws NumberFormatException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(count - 1);
        }
        return Integer.parseInt(sb.toString());
    }

    public static boolean isValidNum(int num, int count) {
        boolean ans = true;
        while (num > 0) {
            if (num % 10 >= count) {
                ans = false;
            }
            num /= 10;
        }
        return ans;
    }

    public static String generateNumbers(int length, int count) {
        StringBuilder sb = new StringBuilder();
        int maxNumber = findMax(length, count);

        for (int i = 0; i <= maxNumber; i++) {
            if (isValidNum(i, count)) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = generateNumbers(4, 3);
        System.out.println(str);

    }
}
