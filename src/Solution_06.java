
//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution_06 {
    PriorityQueue<Integer> queue;

    public int[] sort(PriorityQueue<Integer> queue) {
        int[] sortedArray = new int[queue.size()];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = queue.poll();
        }
        return sortedArray;
    }

    public int[] mergeSort(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            result[k++] = first[i] <= second[j]? first[i++] : second[j++];
        }
        if (i < first.length - 1) {
            for (;i < first.length; i++) {
                result[k++] = first[i];
            }
        }
        else {
            for (;j < second.length; j++) {
                result[k++] = second[j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution_06 obj = new Solution_06();
        int[] firstArray = obj.sort(new PriorityQueue<>(Arrays.asList(6, 2, 8, 0, 55, 3, 1, -4)));
        int[] secondArray = obj.sort(new PriorityQueue<>(Arrays.asList(22, -10, 68, 0, 51, 23, 13, -6)));
        int[] thirdArray = obj.mergeSort(firstArray, secondArray);
        for (Integer i : thirdArray) {
            System.out.print(i + " ");
        }
    }

}
