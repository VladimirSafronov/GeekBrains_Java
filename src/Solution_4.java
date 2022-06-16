
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Solution_4 {
    public static void main(String[] args) {
        hanoi(4, 1, 2);
    }

    public static void hanoi(int n, int i, int k) {
        if (n == 1) {
            System.out.printf("Move disk 1 from pin %d to %d\n", i, k);
        }
        else {
            int temp = 6 - i - k;
            hanoi(n - 1, i, temp);
            System.out.printf("Move disk %d from pin %d to %d\n", n, i, k);
            hanoi(n - 1, temp, k);
        }
    }
}
