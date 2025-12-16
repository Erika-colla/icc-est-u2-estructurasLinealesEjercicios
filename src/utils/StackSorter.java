package utils;

import java.util.Stack;

public class StackSorter {

    public void sort(Stack<Integer> stack) {

        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int actual = stack.pop();

            while (!aux.isEmpty() && aux.peek() > actual) {
                stack.push(aux.pop());
            }

            aux.push(actual);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
}