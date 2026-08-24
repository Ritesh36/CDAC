import java.util.*;

class Assignment1 {
    /*
     * Q1. Find the Maximum Number Accept n numbers through command-line arguments
     * and find and display the maximum number.
     * Note: Assume that at least one number is provided.
     */
    public static int FindMaxNumber(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * Q2. Factorial of a Number
     * Write a program to calculate the factorial of a given non-negative integer.
     */

    public static long FindFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * FindFactorial(n - 1);
    }

    /*
     * Q3. Fibonacci Series
     * Write a program to generate and display the first n terms of the Fibonacci
     * series.
     */

    public static void GenerateFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    /*
     * Q4. Student Grade
     * Write a program to calculate the grade of a student. The student has five
     * subjects,
     * and marks for each subject are entered from the keyboard.
     * Assume that each subject is evaluated out of 20 marks, making the total marks
     * out of 100.
     * Assign the grade according to the following rules:
     * Total Marks Grade
     * 90–100 Ex
     * 80–89 A
     * 70–79 B
     * 60–69 C
     * Below 60 F
     * Display the total marks and the corresponding grade.
     */

    public static void CalculateStudentGrade(int marks[]) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        String grade;
        if (totalMarks >= 90) {
            grade = "Ex";
        } else if (totalMarks >= 80) {
            grade = "A";
        } else if (totalMarks >= 70) {
            grade = "B";
        } else if (totalMarks >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }

    /*
     * Q5. Character Classification
     * Accept a string from the user and count/display the number of:
     * - Uppercase letters
     * - Lowercase letters
     * - Digits
     * - Other characters
     * Display an appropriate message for each category.
     */

    public static void ClassifyCharacters(String input) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Other characters: " + otherCount);
    }

    /*
     * Q6. Matrix Multiplication
     * Write a program to perform multiplication of two matrices.
     * Accept the dimensions and elements of both matrices from the user.
     * Check whether matrix multiplication is possible before performing the
     * operation.
     * Condition: The number of columns in the first matrix must be equal to the
     * number of rows in the second matrix.
     * Display the resulting matrix
     */

    public static void MultiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            System.out.println(
                    "Matrix multiplication is not possible. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resulting Matrix:");
        for (int[] row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    /*
     * Q7. Multiplication Tables
     * Accept two numbers from the user and display the multiplication tables for
     * all numbers from the first number to the second number.
     * Example: For input 5 and 10, display the multiplication tables of 5, 6, 7, 8,
     * 9, and 10.
     */

    public static void DisplayMultiplicationTables(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    /*
     * Q8. Student Details Using a Structure/Class
     * Create a Student structure/class containing the following information:
     * - Student name
     * - Roll number
     * - Total marks
     * The roll number may contain both letters and numbers.
     * Accept the student details from the user and display the data as entered.
     */

    public static class Student {
        String name;
        String rollNumber;
        int totalMarks;

        public Student(String name, String rollNumber, int totalMarks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.totalMarks = totalMarks;
        }

        public void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Total Marks: " + totalMarks);
        }
    }

    /*
     * Q9. Number System Conversion
     * Accept an integer number from the user and display its:
     * - Binary equivalent
     * - Octal equivalent
     * - Hexadecimal equivalent
     * Sample: Enter Number: 20 Given Number: 20 Binary equivalent: 10100 Octal
     * equivalent: 24 Hexadecimal equivalent: 14
     */

    public static void ConvertNumberSystem(int number) {
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number);

        System.out.println("Given Number: " + number);
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }

    /*
     * Q10. Sort Student Names
     * Read at most 10 student names and store them in an appropriate array/list.
     * Sort the names in alphabetical order and display the sorted names.
     * Use appropriate library function for sorting.
     */

    public static void SortStudentNames(String[] names) {
        Arrays.sort(names);
        System.out.println("Sorted Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    /*
     * Q11. Employee Details and Salary Increment Create an Employee structure/class
     * containing:  First name  Last name  Monthly salary Write appropriate
     * functions/methods to: 1. Initialize employee details. 2. Display employee
     * details. 3. Modify the employee's salary. 4. Calculate and display yearly
     * salary. Create two Employee objects. Display the yearly salary of both
     * employees. Then give each employee a 10% salary increase and display their
     * yearly salary again.
     */

    public static class Employee {
        String firstName;
        String lastName;
        double monthlySalary;

        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.monthlySalary = monthlySalary;
        }

        public void displayDetails() {
            System.out.println("Employee Name: " + firstName + " " + lastName);
            System.out.println("Monthly Salary: " + monthlySalary);
        }

        public void modifySalary(double newSalary) {
            this.monthlySalary = newSalary;
        }

        public double calculateYearlySalary() {
            return monthlySalary * 12;
        }
    }

    /*
     * Q12. Reverse a String Write a program to reverse a given string without using
     * a built-in string-reversal function such as strrev() or slicing syntax.
     * Example: Input: SUNBEAM Output: MAEBNUS
     */
    public static String ReverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    /*
     * Q13. Find Duplicate Strings Declare an array/list containing a few strings,
     * including some duplicate strings. Write a program to identify and display the
     * duplicate strings. If a string occurs more than once, display that string
     * only once in the output.
     */
    public static void FindDuplicateStrings(String[] strings) {
        Set<String> uniqueStrings = new HashSet<>();
        Set<String> duplicateStrings = new HashSet<>();

        for (String str : strings) {
            if (!uniqueStrings.add(str)) {
                duplicateStrings.add(str);
            }
        }

        System.out.println("Duplicate Strings:");
        for (String str : duplicateStrings) {
            System.out.println(str);
        }
    }

    /*
     * Q14. String Palindrome Write a program to check whether a given string is a
     * palindrome. A palindrome reads the same forward and backward. Examples:
     * Input: MADAM Output: Palindrome Input: HELLO Output: Not a Palindrome
     */
    public static boolean IsPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /*
     * Q15. Count Occurrences of Alphabets Accept a string from the user and count
     * the occurrence of each alphabet, without considering the difference between
     * uppercase and lowercase letters. Ignore spaces, digits, and special
     * characters. Display the count for each alphabet that occurs in the input.
     * Sample Input: Welcome to SunBeam.
     */
    public static void CountAlphabetOccurrences(String input) {
        Map<Character, Integer> alphabetCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            alphabetCount.put(c, alphabetCount.getOrDefault(c, 0) + 1);
        }
        System.out.println("Alphabet Occurrences:");
        for (Map.Entry<Character, Integer> entry : alphabetCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide at least one number.");
            return;
        }

        int arr[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Maximum number is: " + FindMaxNumber(arr));
        System.out.println("Factorial of the maximum number is: " + FindFactorial(FindMaxNumber(arr)));
        GenerateFibonacciSeries(10);
        DisplayMultiplicationTables(5, 10);
        Student s1 = new Student("John Doe", "A123", 85);
        s1.displayDetails();
        ConvertNumberSystem(20);
        String[] studentNames = { "Alice", "Bob", "Charlie", "David", "Eve" };
        SortStudentNames(studentNames);
        Employee e1 = new Employee("John", "Doe", 5000);
        Employee e2 = new Employee("Jane", "Smith", 6000);
        e1.displayDetails();
        e2.displayDetails();
        System.out.println("Yearly Salary of " + e1.firstName + " " + e1.lastName + ": " + e1.calculateYearlySalary());
        System.out.println("Yearly Salary of " + e2.firstName + " " + e2.lastName + ": " + e2.calculateYearlySalary());
        e1.modifySalary(e1.monthlySalary * 1.1);
        e2.modifySalary(e2.monthlySalary * 1.1);
        System.out.println("Yearly Salary of " + e1.firstName + " " + e1.lastName + " after 10% increase: "
                + e1.calculateYearlySalary());
        System.out.println("Yearly Salary of " + e2.firstName + " " + e2.lastName + " after 10% increase: "
                + e2.calculateYearlySalary());
        
    }
}