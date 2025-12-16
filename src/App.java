import java.util.Stack;
import utils.SingValidator;
import utils.StackSorter;
import utils.QueueUtils;

public class App {

    public static void main(String[] args) {
        runSingValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSingValidator() {
        SingValidator signValidator = new SingValidator();

        String cadena1 = "{[()]}"; // VÁLIDO
        String cadena2 = "{[(])}"; // NO VÁLIDO

        System.out.println("Cadena: " + cadena1 + " es válida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es válida? " + signValidator.isValid(cadena2));
        System.out.println("---------------------------------");
    }

    private static void runStackSorter() {
        StackSorter sorter = new StackSorter();
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack original: " + stack);
        sorter.sort(stack);
        System.out.println("Stack ordenado: " + stack);
        System.out.println("---------------------------------");
    }

    private static void runQueuePalindrome() {
        QueueUtils queueUtils = new QueueUtils();

        System.out.println("ana es palíndromo? " + queueUtils.isPalindrome("ana"));
        System.out.println("radar es palíndromo? " + queueUtils.isPalindrome("radar"));
        System.out.println("java es palíndromo? " + queueUtils.isPalindrome("java"));
    }
}