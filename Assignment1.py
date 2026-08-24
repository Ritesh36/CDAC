# Q.1 Write a Python Program find an area of a rectangle and perimeter of the rectangle.

length = int(input("Enter the length : "))
breadth = int(input("Enter the breadth : "))

print(f"Area of the rectangle is {length * breadth} and perimeter of the rectangle is {2*(length + breadth)}")
print(f"Perimeter of the rectangle is {2*(length + breadth)}")


# 2. Write a Python Program to Convert Celsius To Fahrenheit vice versa.
# Fahrenheit to Celsius: °C = (°F - 32) × 5/9
# Celsius to Fahrenheit: °F = (°C × 9/5) + 32

celsius = float(input("Enter the temperature in celsius : "))
fahrenheit = float(input("Enter the temperature in fahrenheit : "))

print(f"Fahrenheit to Celsius {(fahrenheit - 32) * (5/9)}")
print(f"Celsius to Fahrenheit {(celsius * (9/5)) + 32}")


# 3. Write a program to accept a 4 digit number and
# a. Display face value of each decimal digit
# b. Display place value of each decimal digit
# c. Display no in reverse order by changing decimal place values If user enters a 4 digit number 9361
#    output should be 1639

num = int(input("Enter the 4 digit number : "))
print(f"The first face value is {num // 1000}")
place_value = (num // 1000) * 1000
print(f"The first place value is {place_value}")
num -= place_value
print(f"The second face value is {num // 100}")
place_value = (num // 100) * 100
print(f"The second place value is {place_value}")
num -= place_value
print(f"The third face value is {num // 10}")
place_value = (num // 10) * 10
print(f"The third place value is {place_value}")
num -= place_value
print(f"The fourth face value is {num // 1}")
place_value = (num // 1) * 1
print(f"The fourth place value is {place_value}")


digit  = num % 10
reversed_num = digit * 1000
num //= 10

digit = num % 10
reversed_num = reversed_num + (digit * 100)
num //= 10

digit = num % 10
reversed_num = reversed_num + (digit * 10)
num //= 10

digit = num % 10
reversed_num = reversed_num + (digit * 1)

print(reversed_num)


# 4. Write a program to accept three integer numbers and find its average.

first_num = int(input("Enter the first number: "))
second_num = int(input("Enter the second number: "))
third_num = int(input("Enter the third number: "))

average = (first_num + second_num + third_num) / 3
print(f"The average of the three numbers is {average}")


 

