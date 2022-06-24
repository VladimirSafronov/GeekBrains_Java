import java.util.*;

/*Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
Вычислить запись если это возможно
 */

public class Solution_10 {
    static Map<String, Integer> map = new HashMap<>();
    static Set<String> operations = new HashSet<>();

    static {
        map.put("+", 1);
        map.put("-", 1);
        map.put("/", 2);
        map.put("*", 2);
        map.put("(", 0);

        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");
    }

    public String postfixFrom(String infixExp) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();

        String[] tokens = infixExp.split(" ");
        for (String token : tokens) {
            if (token.equals("(")) {
                stack.push(token);
            }  else if (token.equals(")")) {
                String removedToken = stack.pop();
                while (!removedToken.equals("(")) {
                    result.append(removedToken).append(" ");
                    removedToken = stack.pop();
                }
            } else if (!operations.contains(token)) {
                result.append(token).append(" ");
            }
            else {
                while (!stack.isEmpty() && map.get(stack.peek()) >= map.get(token)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }
        return result.toString().trim();
    }

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        int result = 0;
        Stack<Integer> nums = new Stack<>();
        Set<String> operations = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for (String token : tokens) {
            if (operations.contains(token)) {
                int second = nums.pop();
                int first = nums.pop();
                nums.add(perform(token, first, second));
                result = nums.peek();
            } else {
                nums.add(Integer.parseInt(token));
            }
        }
        return result;
    }

    int perform(String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new RuntimeException();
        }
    }


    public static void main(String[] args) {
        Solution_10 solution = new Solution_10();
        String res = solution.postfixFrom("3 * 5 + ( ( 5 + 5 ) * 10 + 3 * ( 1 + 1 ) )");
        System.out.println(res);
        System.out.println(solution.evalRPN(res.split(" ")));
    }
}
