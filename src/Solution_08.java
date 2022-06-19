
// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

public class Solution_08 {
    static int[][] board; //записываем номер хода на доске
    static int[][] nextStep = new int[][]{{1, 2}, {2, 1}, {1, -2}, {2, -1}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}}; //возможные ходы
    static int maxSteps;
    static int size;

    public static void main(String[] args) {
        size = 5;
        board = new int[size][size];
        maxSteps = size * size;

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                findPath(i, j, 1);
                printSteps();
                return;
            }
        }
        System.out.println("Решения нет");
    }

    public static boolean findPath(int curX, int curY, int countSteps) {
        board[curX][curY] = countSteps;
        if (countSteps >= maxSteps) {
            return true;
        }

        for (int i = 0; i < nextStep.length; i++) {
            int nextX = curX + nextStep[i][0];
            int nextY = curY + nextStep[i][1];
            if (checkStep(nextX, nextY) && findPath(nextX, nextY, countSteps + 1)) {
                return true;
            }
        }

        board[curX][curY] = 0;
        return false;
    }

    public static boolean checkStep(int x, int y) {
        return (x >= 0 && x < size && y >= 0 && y < size && board[x][y] == 0);
    }

    static void printSteps() {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
