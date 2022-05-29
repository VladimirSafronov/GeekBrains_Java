/* На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
        - команда 1 (к1): увеличить в с раза, а умножается на c
        - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
        написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить,
        что это невозможно

        Пример 1: а = 1, b = 7, c = 2, d = 1
        ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
        Пример 2: а = 11, b = 7, c = 2, d = 1
        ответ: нет решения.
        *Подумать над тем, как сделать минимальное количество команд */

public class Solution_02 {
    final static int A = 16;
    final static int B = 15;
    final static int C = 2;
    final static int D = 1;

    public static String findIterations(int a, int b, int c, int d) {
        StringBuilder sb = new StringBuilder();

        if (a >= b) {
            sb.append("Нет решения!");
        }
        else {
            while ((a * c) < b) {
                sb.append("k1 ");
                a *= c;
            }
            while (a != b) {
                sb.append("k2 ");
                a += d;
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

        String str = findIterations(A, B, C, D);
        System.out.println(str);
    }
}
