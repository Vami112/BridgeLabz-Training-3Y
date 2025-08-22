//package Arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        //LEVEL 1

        //Q1
        // Scanner sc = new Scanner(System.in);
        // int[] ages = new int[10];
        // for (int i = 0; i < ages.length; i++) {
        //     ages[i] = sc.nextInt();
        // }
        // for (int age : ages) {
        //     if (age < 0) {
        //         System.out.println("Invalid age");
        //     } else if (age >= 18) {
        //         System.out.println("The student with the age " + age + " can vote.");
        //     } else {
        //         System.out.println("The student with the age " + age + " cannot vote.");
        //     }
        // }


        //Q2
        // Scanner sc = new Scanner(System.in);
        // int[] numbers = new int[5];
        // for (int i = 0; i < numbers.length; i++) {
        //     numbers[i] = sc.nextInt();
        // }
        // for (int n : numbers) {
        //     if (n > 0) {
        //         if (n % 2 == 0)
        //             System.out.println(n + " is Positive and Even");
        //         else
        //             System.out.println(n + " is Positive and Odd");
        //     } else if (n < 0) {
        //         System.out.println(n + " is Negative");
        //     } else {
        //         System.out.println(n + " is Zero");

        //Q3
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int[] table = new int[10];
        // for (int i = 1; i <= 10; i++) {
        //     table[i - 1] = num * i;
        //     System.out.println(num + " * " + i + " = " + table[i - 1]);
        // }


        //Q4
        // Scanner sc = new Scanner(System.in);
        // double[] arr = new double[10];
        // double total = 0.0;
        // int index = 0;
        // while (true) {
        //     if (index == 10) break;
        //     double n = sc.nextDouble();
        //     if (n <= 0) break;
        //     arr[index] = n;
        //     index++;
        // }
        // for (int i = 0; i < index; i++) {
        //     System.out.print(arr[i] + " ");
        //     total += arr[i];
        // }
        // System.out.println("\nSum = " + total);


        //Q5
        // int[] results = new int[40];
        // int index = 0;
        // for (int num = 6; num <= 9; num++) {
        //     for (int i = 1; i <= 10; i++) {
        //         results[index++] = num * i;
        //         System.out.println(num + " * " + i + " = " + (num * i));
        //     }
        // }


        //Q6
        // Scanner sc = new Scanner(System.in);
        // double[] heights = new double[11];
        // double sum = 0;
        // for (int i = 0; i < heights.length; i++) {
        //     heights[i] = sc.nextDouble();
        //     sum += heights[i];
        // }
        // double mean = sum / heights.length;
        // System.out.println("Mean height = " + mean);

        //Q7
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if (number <= 0) {
        //     System.out.println("Invalid input");
        //     return;
        // }
        // int[] odd = new int[number/2 + 1];
        // int[] even = new int[number/2 + 1];
        // int oi = 0, ei = 0;
        // for (int i = 1; i <= number; i++) {
        //     if (i % 2 == 0) even[ei++] = i;
        //     else odd[oi++] = i;
        // }
        // System.out.print("Odd numbers: ");
        // for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");
        // System.out.print("\nEven numbers: ");
        // for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");


        //Q8
        //  Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // int maxFactor = 10;
        // int[] factors = new int[maxFactor];
        // int index = 0;
        // for (int i = 1; i <= number; i++) {
        //     if (number % i == 0) {
        //         if (index == factors.length) {
        //             maxFactor *= 2;
        //             int[] temp = new int[maxFactor];
        //             for (int j = 0; j < factors.length; j++) temp[j] = factors[j];
        //             factors = temp;
        //         }
        //         factors[index++] = i;
        //     }
        // }
        // System.out.print("Factors: ");
        // for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");


        //Q9
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int[][] matrix = new int[rows][cols];
        // for (int i = 0; i < rows; i++)
        //     for (int j = 0; j < cols; j++)
        //         matrix[i][j] = sc.nextInt();
        // int[] array = new int[rows * cols];
        // int index = 0;
        // for (int i = 0; i < rows; i++)
        //     for (int j = 0; j < cols; j++)
        //         array[index++] = matrix[i][j];
        // for (int i = 0; i < array.length; i++)
        //     System.out.print(array[i] + " ");


        //Q10
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if (number <= 0) {
        //     System.out.println("Invalid input");
        //     return;
        // }
        // String[] result = new String[number + 1];
        // for (int i = 0; i <= number; i++) {
        //     if (i % 3 == 0 && i % 5 == 0)
        //         result[i] = "FizzBuzz";
        //     else if (i % 3 == 0)
        //         result[i] = "Fizz";
        //     else if (i % 5 == 0)
        //         result[i] = "Buzz";
        //     else
        //         result[i] = String.valueOf(i);
        // }
        // for (int i = 0; i <= number; i++) {
        //     System.out.println("Position " + i + " = " + result[i]);
        // }


        





        //LEVEL 2

        //Q1
        // Scanner sc = new Scanner(System.in);
        // double[] salary = new double[10];
        // double[] service = new double[10];
        // double[] bonus = new double[10];
        // double[] newSalary = new double[10];
        // double totalBonus = 0, totalOld = 0, totalNew = 0;
        // for (int i = 0; i < 10; i++) {
        //     double s = sc.nextDouble();
        //     double y = sc.nextDouble();
        //     if (s <= 0 || y < 0) {
        //         i--;
        //         continue;
        //     }
        //     salary[i] = s;
        //     service[i] = y;
        // }
        // for (int i = 0; i < 10; i++) {
        //     if (service[i] > 5) bonus[i] = salary[i] * 0.05;
        //     else bonus[i] = salary[i] * 0.02;
        //     newSalary[i] = salary[i] + bonus[i];
        //     totalBonus += bonus[i];
        //     totalOld += salary[i];
        //     totalNew += newSalary[i];
        // }
        // System.out.println("Total Bonus = " + totalBonus);
        // System.out.println("Total Old Salary = " + totalOld);
        // System.out.println("Total New Salary = " + totalNew);


        //Q2
        // Scanner sc = new Scanner(System.in);
        // int[] age = new int[3];
        // int[] height = new int[3];
        // for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        // for (int i = 0; i < 3; i++) height[i] = sc.nextInt();
        // int youngest = 0, tallest = 0;
        // for (int i = 1; i < 3; i++) {
        //     if (age[i] < age[youngest]) youngest = i;
        //     if (height[i] > height[tallest]) tallest = i;
        // }
        // String[] names = {"Amar", "Akbar", "Anthony"};
        // System.out.println("Youngest: " + names[youngest]);
        // System.out.println("Tallest: " + names[tallest]);


        //Q3
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int maxDigit = 10, index = 0;
        // int[] digits = new int[maxDigit];
        // while (num != 0 && index < maxDigit) {
        //     digits[index++] = num % 10;
        //     num /= 10;
        // }
        // int largest = 0, second = 0;
        // for (int i = 0; i < index; i++) {
        //     if (digits[i] > largest) {
        //         second = largest;
        //         largest = digits[i];
        //     } else if (digits[i] > second && digits[i] != largest) {
        //         second = digits[i];
        //     }
        // }
        // System.out.println("Largest = " + largest);
        // System.out.println("Second Largest = " + second);


        //Q4
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int maxDigit = 10, index = 0;
        // int[] digits = new int[maxDigit];
        // while (num != 0) {
        //     if (index == maxDigit) {
        //         maxDigit += 10;
        //         int[] temp = new int[maxDigit];
        //         for (int i = 0; i < digits.length; i++) temp[i] = digits[i];
        //         digits = temp;
        //     }
        //     digits[index++] = num % 10;
        //     num /= 10;
        // }
        // int largest = 0, second = 0;
        // for (int i = 0; i < index; i++) {
        //     if (digits[i] > largest) {
        //         second = largest;
        //         largest = digits[i];
        //     } else if (digits[i] > second && digits[i] != largest) {
        //         second = digits[i];
        //     }
        // }
        // System.out.println("Largest = " + largest);
        // System.out.println("Second Largest = " + second);


        //Q5
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // String s = String.valueOf(num);
        // int[] digits = new int[s.length()];
        // for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        // System.out.print("Reversed: ");
        // for (int i = digits.length - 1; i >= 0; i--) System.out.print(digits[i]);


        //Q6
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // double[] height = new double[n];
        // double[] weight = new double[n];
        // double[] bmi = new double[n];
        // String[] status = new String[n];
        // for (int i = 0; i < n; i++) {
        //     weight[i] = sc.nextDouble();
        //     height[i] = sc.nextDouble();
        //     bmi[i] = weight[i] / (height[i] * height[i]);
        //     if (bmi[i] <= 18.4) status[i] = "Underweight";
        //     else if (bmi[i] <= 24.9) status[i] = "Normal";
        //     else if (bmi[i] <= 39.9) status[i] = "Overweight";
        //     else status[i] = "Obese";
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println("H=" + height[i] + " W=" + weight[i] + " BMI=" + bmi[i] + " Status=" + status[i]);
        // }


        //Q7
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // double[][] personData = new double[n][3];
        // String[] status = new String[n];
        // for (int i = 0; i < n; i++) {
        //     double w = sc.nextDouble();
        //     double h = sc.nextDouble();
        //     if (w <= 0 || h <= 0) {
        //         i--;
        //         continue;
        //     }
        //     personData[i][0] = w;
        //     personData[i][1] = h;
        //     personData[i][2] = w / (h * h);
        //     if (personData[i][2] <= 18.4) status[i] = "Underweight";
        //     else if (personData[i][2] <= 24.9) status[i] = "Normal";
        //     else if (personData[i][2] <= 39.9) status[i] = "Overweight";
        //     else status[i] = "Obese";
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println("H=" + personData[i][1] + " W=" + personData[i][0] + " BMI=" + personData[i][2] + " Status=" + status[i]);
        // }


        //Q8
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] phy = new int[n];
        // int[] chem = new int[n];
        // int[] math = new int[n];
        // double[] per = new double[n];
        // String[] grade = new String[n];
        // for (int i = 0; i < n; i++) {
        //     int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
        //     if (p < 0 || c < 0 || m < 0) {
        //         i--;
        //         continue;
        //     }
        //     phy[i] = p; chem[i] = c; math[i] = m;
        //     per[i] = (p + c + m) / 3.0;
        //     if (per[i] >= 80) grade[i] = "A";
        //     else if (per[i] >= 70) grade[i] = "B";
        //     else if (per[i] >= 60) grade[i] = "C";
        //     else if (per[i] >= 50) grade[i] = "D";
        //     else if (per[i] >= 40) grade[i] = "E";
        //     else grade[i] = "R";
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println("P=" + phy[i] + " C=" + chem[i] + " M=" + math[i] + " %=" + per[i] + " Grade=" + grade[i]);
        // }



        //Q9
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[][] marks = new int[n][3];
        // double[] per = new double[n];
        // String[] grade = new String[n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         int m = sc.nextInt();
        //         if (m < 0) {
        //             j--;
        //             continue;
        //         }
        //         marks[i][j] = m;
        //     }
        //     per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
        //     if (per[i] >= 80) grade[i] = "A";
        //     else if (per[i] >= 70) grade[i] = "B";
        //     else if (per[i] >= 60) grade[i] = "C";
        //     else if (per[i] >= 50) grade[i] = "D";
        //     else if (per[i] >= 40) grade[i] = "E";
        //     else grade[i] = "R";
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println("P=" + marks[i][0] + " C=" + marks[i][1] + " M=" + marks[i][2] + " %=" + per[i] + " Grade=" + grade[i]);
        // }



        //Q10
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // String s = String.valueOf(num);
        // int[] freq = new int[10];
        // for (int i = 0; i < s.length(); i++) {
        //     int d = s.charAt(i) - '0';
        //     freq[d]++;
        // }
        // for (int i = 0; i < 10; i++) {
        //     if (freq[i] > 0) System.out.println(i + " -> " + freq[i]);
        // }




    }
    
}
