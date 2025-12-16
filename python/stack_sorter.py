class StackSorter:
    
    def sort(self, stack: list) -> None:
        aux = []

        while len(stack) > 0:
            actual = stack.pop()

            while len(aux) > 0 and aux[-1] > actual:
                stack.append(aux.pop())

            aux.append(actual)

        while len(aux) > 0:
            stack.append(aux.pop())