/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/stack-designer/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

public class Solution {
    public static Stack<Integer> push(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        if (arr != null) {
            for (int num : arr) {
                stack.push(num);
            }
        }
        return stack;
    }

    public static void printAndPop(Stack<Integer> s) {
        if (s == null || s.isEmpty()) return;
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
            if (!s.isEmpty()) sb.append(" ");
        }
        System.out.print(sb.toString());
    }
}

