# 1. Using for loop, write and run a Python program to find factorial from 0 to 10.

val = int(input("Enter the num whose factorial you want to find : "))
def factorial(num: int) -> int:
	fact = 1
	for num in range(num, 1, -1):
		fact = fact * num

	return fact

print(factorial(5))

# 2. Write a program that accepts a list from user and print the alternate element of list.

userInp = int(input("How many elements you want to enter: "))
elements = []
for num in range(userInp):
    elements.append(input(f"Enter element {num + 1}: "))

for num in range(0, len(elements), 2):
    print(elements[num])

# 3. Replace single element ‘b’ in given list [’a’, ’b’, ’c’, ’d’, ’e’] with [1, 2, 3].
char_list = ['a', 'b', 'c', 'd', 'e']

char_list.insert(char_list.index('b'), str([1, 2, 3]))
print(char_list)

# 4. Write a program to find index of element ‘e’ in given vowels list [’a’, ’e’, ’i’,’o’, ’i’, ’u’].

vowels = ['a', 'e', 'i', 'o', 'u']
print(vowels.index('e'))

# 5. Define a function overlapping() that takes two lists and returns True if they have at least one member in
#    common, False otherwise.

list1 = [1, 2, 3, 4, 5]
list2 = [10, 6, 7, 8, 9]

def overlapping(list1: list, list2: list) -> bool:
    for i in list1:
        for j in list2:
            if i == j:
                return True
    return False

print(overlapping(list1, list2))

# 6. Find and display the largest number of a list without using built-in function max(). Your program should
# ask the user to input values in list from keyboard.

userInp = int(input("How many elements you want to enter: "))
user_list = []

for i in range(0, userInp):
    val = int(input(f"Enter the {i + 1}th number : "))
    user_list.append(val)

def maximum(p1: list) -> float:
    max_num = float('-inf')
    for i in p1:
        if i > max_num:
            max_num = i
    return max_num 

print(maximum(user_list))

# 7. Write a function filter_long_words() that takes a list of words and an integer len and returns the list of
#    words that are longer than len.


length = int(input("How many elements you want to enter: "))
words = []

for i in range(0, length):
    val = input(f"Enter the {i + 1}th word : ")
    words.append(val)

min_length = int(input("Enter minimum length of words to filter: "))

def filter_long_words(words: list, min_len: int) -> list:
    result = []
    for word in words:
        if len(word) > min_len:
            result.append(word)
    return result

filtered = filter_long_words(words, min_length)
print(filtered)
        
    

        