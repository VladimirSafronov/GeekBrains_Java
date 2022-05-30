//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd, результат - a4b3cd2


public class Solution_04 {

    public static String zipper(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == sb.charAt(sb.length() - 1)) {
                count++;
            }
            else {
                sb.append(count == 1 ? "" : count).append(str.charAt(i));
                count = 1;
            }
        }
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(zipper(str));
    }
}
