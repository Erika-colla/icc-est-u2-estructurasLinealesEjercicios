from collections import deque

class QueueUtils:

    def is_palindrome(self, texto: str) -> bool:
        cola_original = deque(texto)
        cola_invertida = deque()
        aux = deque(texto)

        while aux:
            cola_invertida.appendleft(aux.popleft())

        while cola_original:
            if cola_original.popleft() != cola_invertida.popleft():
                return False

        return True