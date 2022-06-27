import java.util.*;

//организовать алгоритм пирамидальной сортировки (Heap Sort) при помощи PriorityQueue

public class HeapSort {
    PriorityQueue<Integer> myQueue;

    public List<Integer> sort(PriorityQueue<Integer> queue) {
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        obj.myQueue = new PriorityQueue<>(Arrays.asList(5, 3, 8, 9, 1));
        List<Integer> sortList = obj.sort(obj.myQueue);
        for(Integer l : sortList) {
            System.out.print(l + " ");
        }
    }
}
