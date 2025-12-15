class SingValidator:
    
    def is_valid(self, signos: str) -> bool:
        stack = []

        caracteres = list(signos)
        for character in caracteres:
            
            if self.get_is_apertura(character):
                stack.append(character)
            else:
                if len(stack) == 0:
                    return False

                ultimo = stack.pop()  
                if not self.is_tipo_igual(ultimo, character):
                    return False

        return len(stack) == 0

    def get_is_apertura(self, c: str) -> bool:
        return c == '(' or c == '{' or c == '['

    def is_tipo_igual(self, apertura: str, cierre: str) -> bool:
        return (apertura == '(' and cierre == ')') or \
               (apertura == '{' and cierre == '}') or \
               (apertura == '[' and cierre == ']')