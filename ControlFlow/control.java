//package ControlFlow;

import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        //LEVEL 2

        //Q1
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // for (int i = 1; i <= number; i++) {
        //     if (i % 2 == 0)
        //         System.out.println(i + " Even");
        //     else
        //         System.out.println(i + " Odd");

        //Q2
        // Scanner sc = new Scanner(System.in);
        // int salary = sc.nextInt();
        // int years = sc.nextInt();
        // if (years > 5)
        //     System.out.println("Bonus = " + (salary * 0.05));
        // else
        //     System.out.println("No Bonus");

        //Q3
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for (int i = 6; i <= 9; i++)
        //     System.out.println(num + " * " + i + " = " + (num * i));

        //Q4
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
        //     else if (i % 3 == 0) System.out.println("Fizz");
        //     else if (i % 5 == 0) System.out.println("Buzz");
        //     else System.out.println(i);

        //Q5
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(), i = 1;
        // while (i <= n) {
        //     if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
        //     else if (i % 3 == 0) System.out.println("Fizz");
        //     else if (i % 5 == 0) System.out.println("Buzz");
        //     else System.out.println(i);
        //     i++;

        //Q6
        // Scanner sc = new Scanner(System.in);
        // int age1 = sc.nextInt(), h1 = sc.nextInt();
        // int age2 = sc.nextInt(), h2 = sc.nextInt();
        // int age3 = sc.nextInt(), h3 = sc.nextInt();
        // if (age1 < age2 && age1 < age3) System.out.println("Amar youngest");
        // else if (age2 < age3) System.out.println("Akbar youngest");
        // else System.out.println("Anthony youngest");
        // if (h1 > h2 && h1 > h3) System.out.println("Amar tallest");
        // else if (h2 > h3) System.out.println("Akbar tallest");
        // else System.out.println("Anthony tallest");

        //Q7
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for (int i = 1; i <= num; i++) {
        //     if (num % i == 0) System.out.println(i);

        //Q8
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), i = 1;
        // while (i <= num) {
        //     if (num % i == 0) System.out.println(i);
        //     i++;

        //Q9
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), greatest = 1;
        // for (int i = num - 1; i >= 1; i--) {
        //     if (num % i == 0) {
        //         greatest = i;
        //         break;
        //     }
        // }
        // System.out.println(greatest);

        //Q10
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), i = num - 1, greatest = 1;
        // while (i >= 1) {
        //     if (num % i == 0) {
        //         greatest = i;
        //         break;
        //     }
        //     i--;
        // }
        // System.out.println(greatest);

        //Q11
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for (int i = 1; i < 100; i++) {
        //     if (i % num == 0) System.out.println(i);
        // }

        //Q12
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), pow = sc.nextInt(), result = 1;
        // for (int i = 1; i <= pow; i++) {
        //     result *= num;
        // }
        // System.out.println(result);

        //Q13
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), i = 1;
        // while (i < 100) {
        //     if (i % num == 0) System.out.println(i);
        //     i++;
        // }

        //Q14
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt(), pow = sc.nextInt(), result = 1, i = 0;
        // while (i < pow) {
        //     result *= num;
        //     i++;
        // }
        // System.out.println(result);

        





        //LEVEL 3

        //Q1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a year: ");
        // int year = sc.nextInt();

        // if (year >= 1582) {
        //     if (year % 4 == 0) {
        //         if (year % 100 == 0) {
        //             if (year % 400 == 0) {
        //                 System.out.println(year + " is a Leap Year.");
        //             } else {
        //                 System.out.println(year + " is Not a Leap Year.");
        //             }
        //         } else {
        //             System.out.println(year + " is a Leap Year.");
        //         }
        //     } else {
        //         System.out.println(year + " is Not a Leap Year.");
        //     }
        // } else {
        //     System.out.println("Year must be >= 1582.");
        // }

        //Q2
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a year: ");
        // int year = sc.nextInt();

        // if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
        //     System.out.println(year + " is a Leap Year.");
        // } else {
        //     System.out.println(year + " is Not a Leap Year.");
        // }

        //Q3
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter marks in Physics: ");
        // int physics = sc.nextInt();
        // System.out.print("Enter marks in Chemistry: ");
        // int chemistry = sc.nextInt();
        // System.out.print("Enter marks in Maths: ");
        // int maths = sc.nextInt();
        // int total = physics + chemistry + maths;
        // double percentage = total / 3.0;
        // System.out.println("Average Marks: " + percentage);
        // if (percentage >= 90)
        //     System.out.println("Grade: A+ (Excellent)");
        // else if (percentage >= 75)
        //     System.out.println("Grade: A (Very Good)");
        // else if (percentage >= 60)
        //     System.out.println("Grade: B (Good)");
        // else if (percentage >= 50)
        //     System.out.println("Grade: C (Average)");
        // else
        //     System.out.println("Grade: F (Fail)");


        //Q4
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // boolean isPrime = true;
        // if (num <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= num / 2; i++) {
        //         if (num % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }
        // if (isPrime)
        //     System.out.println(num + " is a Prime Number.");
        // else
        //     System.out.println(num + " is Not a Prime Number.");


        //Q5
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int originalNumber = number, sum = 0;
        // while (originalNumber != 0) {
        //     int digit = originalNumber % 10;
        //     sum += digit * digit * digit;
        //     originalNumber /= 10;
        // }
        // if (sum == number)
        //     System.out.println(number + " is an Armstrong Number.");
        // else
        //     System.out.println(number + " is Not an Armstrong Number.");


        //Q6
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int count = 0;
        // while (number != 0) {
        //     number /= 10;
        //     count++;
        // }
        // System.out.println("Number of Digits: " + count);


        //Q7
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter weight in kg: ");
        // double weight = sc.nextDouble();
        // System.out.print("Enter height in cm: ");
        // double heightCm = sc.nextDouble();
        // double heightM = heightCm / 100;
        // double bmi = weight / (heightM * heightM);
        // System.out.println("BMI: " + bmi);
        // if (bmi < 18.5)
        //     System.out.println("Underweight");
        // else if (bmi < 24.9)
        //     System.out.println("Normal weight");
        // else if (bmi < 29.9)
        //     System.out.println("Overweight");
        // else
        //     System.out.println("Obesity");


        //Q8
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int sum = 0, temp = number;
        // while (temp > 0) {
        //     sum += temp % 10;
        //     temp /= 10;
        // }
        // if (number % sum == 0)
        //     System.out.println(number + " is a Harshad Number.");
        // else
        //     System.out.println(number + " is Not a Harshad Number.");


        //Q9
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i < number; i++) {
        //     if (number % i == 0) {
        //         sum += i;
        //     }
        // }
        // if (sum > number)
        //     System.out.println(number + " is an Abundant Number.");
        // else
        //     System.out.println(number + " is Not an Abundant Number.");


        //Q10
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // double first = sc.nextDouble();
        // System.out.print("Enter second number: ");
        // double second = sc.nextDouble();
        // System.out.print("Enter operator (+, -, *, /): ");
        // String op = sc.next();
        // switch (op) {
        //     case "+":
        //         System.out.println("Result: " + (first + second));
        //         break;
        //     case "-":
        //         System.out.println("Result: " + (first - second));
        //         break;
        //     case "*":
        //         System.out.println("Result: " + (first * second));
        //         break;
        //     case "/":
        //         if (second != 0)
        //             System.out.println("Result: " + (first / second));
        //         else
        //             System.out.println("Division by zero error!");
        //         break;
        //     default:
        //         System.out.println("Invalid Operator");
        // }


        //Q11
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter month (1-12): ");
        // int m = sc.nextInt();
        // System.out.print("Enter day: ");
        // int d = sc.nextInt();
        // System.out.print("Enter year: ");
        // int y = sc.nextInt();
        // int y0 = y - (14 - m) / 12;
        // int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // int m0 = m + 12 * ((14 - m) / 12) - 2;
        // int d0 = (d + x + (31 * m0) / 12) % 7;
        // System.out.println("Day of Week: " + d0);
        // System.out.println("0=Sunday, 1=Monday, ..., 6=Saturday");































    }
    
}
}
