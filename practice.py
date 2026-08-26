# num = 5 + 2j
# print(f"{num} and its type is {type(num)}")

num = int(3.14)
print(f"The value of num is {num} and its type is {type(num)}")

def greet(name: str):
    """This function takes a name as input and prints a greeting message."""  #docstring
    print(f"Hello, {name}!")

greet("Ritesh")
print(greet.__doc__)  # Print the docstring of the greet function