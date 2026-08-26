
''' 1. Write A Program which is taking 5 int value and calculate sum of cube of all numbers [Write cube
function'''

val1 = int (input ("enter the 1 value")) 
val2 = int (input ("enter the 2 value")) 
val3 = int (input ("enter the 3 value")) 
val4 = int (input ("enter the 4 value")) 
val5 = int (input ("enter the 5 value")) 

def calculate_cube():
    sum = (val1*val1*val1)+(val2*val2*val2)+(val3*val3*val3)+(val4*val4*val4)+(val5*val5*val5)
    return sum

print(calculate_cube())


''' 2. Write a Python function to find the maximum of three numbers.'''

val1 = int (input ("enter the 1 value")) 
val2 = int (input ("enter the 2 value")) 
val3 = int (input ("enter the 3 value")) 
def find_max():
    if(val1>val2 and val1>val3 ):
        print("val1 is greatest",val1)
    elif(val2>val1 and val2>val3 ):
        print("val2 is greatest",val2)
    else:
        print("val3 is greatest",val3)
find_max()


# 3. write a program to find given number is positive ,negative or zero

val = int (input ("enter the 1 value")) 
def findnum ():
    if(val<0):
        print("neative")
    elif(val==0):
        print("zero")
    else:
        print("positive")
findnum()

# 4. Write a program that prompts the user to input a year and determine whether the year is a leap year or
#    not.Leap Years are any year that can be evenly divided by 4. A year that is evenly divisible by 100 is a
#    leap year only if it is also evenly divisible by 400.Example:1992 Leap Year2000 Leap Year1900 NOT a Leap Year1995 NOT a Leap Year

year = int (input ("enter the year: ")) 
def leap_year():
    if(year%400==0 ):
        print("leap year")
        if(year%4==0):
            print("leap year")
    else:
        print("not a leap year")

leap_year()


# 5. Write a program that prompts the user to input number of calls and calculate the monthly telephone
#    bills as per the following rule:Minimum Rs. 200 for up to 100 calls.Plus Rs. 0.60 per call for next 50 calls.Plus Rs. 0.50 per call for next 50 calls.Plus Rs. 0.40 per call for any call beyond 200 calls.

calls = int (input ("enter the number of calls"))
def bill ():
    if(calls<=100):
        print ("200 ")
    elif(calls>100 and calls <= 150):
        b = calls - 100 
        c = (b * 0.6) + 200
        print(c)
    elif(calls>150 and calls <= 200):
        a = calls - 150
        d = (a * 0.5) + 230
        print(d) 
    elif(calls>200):
        e = calls - 200
        f = (e * 0.4) + 255
        print(f)
bill()

# 6. The marks obtained by a student in 3 different subjects are input by the user. Your program should
# calculate the average of subjects and display the grade. The student gets a grade as per the following
# rules:
# Average Grade
# 90-100 A80-89 B70-79 C60-69 D0-59 F

mark1 = int(input("Enter the subject 1 "))
mark2 = int(input("Enter the subject 2 "))
mark3 = int(input("Enter the subject 3 "))

def grade():
    avg = ((mark1+mark2+mark3) // 3)
    if(avg >= 90):
       print("A")
    elif(avg >= 80):
        print("b")
    elif(avg >= 70):
        print("c")
    elif(avg >= 60):
        print("d")
    else :
       print("f")
grade()


# 7. Write a program that will calculate the price for a quantity entered from the keyboard, given that the
#    unit price is Rs 5 and there is a discount of 10 percent for quantities over 30 and a 15 percent discount
#    for quantities over 50

quantity = int(input("Enter the quantity: "))
unit_price = 5

def calculate_price(quantity: int) -> float:
    total_price = quantity * unit_price
    if quantity > 50:
        discount = 0.15
    elif quantity > 30:
        discount = 0.10
    else:
        discount = 0.0

    discounted_price = total_price * (1 - discount)
    return discounted_price

print(calculate_price(quantity))


# 8. Write a program that prompts the user to input a character and determine the character is vowel or
# consonant.

char = input("Enter the character: ")

def function(char: str):
    if char.lower() in "aeiou":
        print("vowel")
    else:
        print("consonant")

function(char)

# 9. write a function to return simple interest.
# To calculate simple interest, you can use the formula: SI = (P × R × T) / 100
# SI: Stands for simple interest
# P: Represents the principal amount
# R: Represents the interest rate per year
# T: Represents the time in years

p = int(input("Enter the principal amount: "))
r = int(input("Enter the interest rate: "))
t = int(input("Enter the time in years: "))

def simple_interest(p1, p2, p3):
    si = (p * r * t) / 100
    return si

print(simple_interest(p, r, t))

# 10. write a function to return compound interest.
# CI = P (1 + r/n) ^ nt
# P - Principal Amount
# r - Rate of interest
# n - Number of times interest compounds in a year
# t - Number of years

p = float(input("Enter the principal amount: "))
r = float(input("Enter the rate of interest: "))
n = int(input("Enter the number of times interest compounds in a year: "))
t = int(input("Enter the number of years: "))

def compound_interest(principal, rate, compounds, years):
    # Divide rate by 100 to convert percentage (5) to decimal (0.05)
    r_decimal = rate / 100 
    amount = principal * (1 + (r_decimal / compounds)) ** (compounds * years)
    
    return amount

print(compound_interest(p, r, n, t))