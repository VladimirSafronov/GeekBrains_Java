/*Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
        (возвращает boolean значение)
*/

public class Solution_03 {


    public static boolean isPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "asfdoru";
        String str2 = "asddsa";


    }
}
