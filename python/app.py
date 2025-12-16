from sign_validator import SingValidator
from stack_sorter import StackSorter
from queue_utils import QueueUtils


def run_sign_validator():
    sign_validator = SingValidator()

    cadena1 = "{[()]}"   # VALIDO
    cadena2 = "{[(])}"   # NO VALIDO

    print(f"Cadena: {cadena1} es válida? {sign_validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es válida? {sign_validator.is_valid(cadena2)}")
    print("---------------------------------")


def run_stack_sorter():
    sorter = StackSorter()
    stack = [5, 1, 4, 2]

    print("Stack original:", stack)
    sorter.sort(stack)
    print("Stack ordenado:", stack)
    print("---------------------------------")


def run_queue_palindrome():
    queue_utils = QueueUtils()

    print("ana es palíndromo?", queue_utils.is_palindrome("ana"))
    print("radar es palíndromo?", queue_utils.is_palindrome("radar"))
    print("java es palíndromo?", queue_utils.is_palindrome("java"))


if __name__ == "__main__":
    run_sign_validator()
    run_stack_sorter()
    run_queue_palindrome()