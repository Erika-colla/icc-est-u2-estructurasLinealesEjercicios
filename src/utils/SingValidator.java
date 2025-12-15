package utils;

import java.util.Stack;

public class SingValidator {

    public boolean isValid(String signos) {

        Stack<Character> stack = new Stack<Character>();

        char[] caracteres = signos.toCharArray();
        for (Character character : caracteres) {
            // 1 -> comprobar si es de apertura o cierre
            if(getIsApertura(character)) {
                stack.push(character);
            }else{
                if(stack.isEmpty()) {
                    return false;
                }
                char ultimo = stack.pop(); //Apertura
                if (!isTipoIgual(ultimo, character)) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isTipoIgual(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
}
