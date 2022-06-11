
import java.util.ArrayList;
import java.util.List;

/* Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
You may return the answer in any order.
Example:
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]*/

public class Solution_leetCode_Combinations {
    List<Integer> array = new ArrayList<>();
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        comb(n, k, 1, 0);
        return list;
    }

    void comb(int n, int k, int number, int index) {
        if (index == k) {
            list.add(new ArrayList<>(array));
            return;
        }
        if (number > n) {
            return;
        }
        for(int i = number; i <= n; i++) {
            array.add(i);
            comb(n, k, i + 1, index + 1);
            array.remove(array.size() - 1);
        }
    }
}
