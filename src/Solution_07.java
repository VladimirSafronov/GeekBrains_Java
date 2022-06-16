
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

import java.util.Arrays;

public class Solution_07 {

    public static boolean checkPosition(int[][] board, int row, int column) {
        for (int i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row + 1, j = column - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean solveQueen(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            if (checkPosition(board, i, col)) {
                board[i][col] = 1;

                if (solveQueen(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }
        return false;
    }

    public static void printTable(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] table = {{0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0}};

        if (!solveQueen(table, 0)) {
            System.out.println("Решения нет");
        }

        printTable(table);
    }
}
