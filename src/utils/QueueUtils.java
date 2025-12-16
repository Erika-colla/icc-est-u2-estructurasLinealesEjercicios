package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean isPalindrome(String texto) {

        Queue<Character> colaOriginal = new LinkedList<>();
        Queue<Character> colaInvertida = new LinkedList<>();
        Queue<Character> aux = new LinkedList<>();

        for (char c : texto.toCharArray()) {
            colaOriginal.add(c);
            aux.add(c);
        }

        while (!aux.isEmpty()) {
            char temp = aux.remove();

            int size = colaInvertida.size();
            colaInvertida.add(temp);

            for (int i = 0; i < size; i++) {
                colaInvertida.add(colaInvertida.remove());
            }
        }

        while (!colaOriginal.isEmpty()) {
            if (!colaOriginal.remove().equals(colaInvertida.remove())) {
                return false;
            }
        }

        return true;
    }
}