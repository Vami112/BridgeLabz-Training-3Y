import java.util.*;

public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: BMI
        for (int i = 1; i <= 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            double bmi = weight / (height * height);
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            System.out.println("Person " + i + ": BMI=" + bmi + " Status=" + status);
        }

        // Q2: Unique characters
        String s = sc.next();
        StringBuilder uniq = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (uniq.indexOf(String.valueOf(c)) == -1) uniq.append(c);
        }
        System.out.println("Unique: " + uniq);

        // Q3: First non-repeating
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("First non-repeating: " + c);
                break;
            }
        }

        // Q4: Frequency using array
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) System.out.println((char)i + ":" + freq[i]);

        // Q5: Frequency using nested loop
        for (int i = 0; i < uniq.length(); i++) {
            char c = uniq.charAt(i);
            int count = 0;
            for (char ch : s.toCharArray()) if (ch == c) count++;
            System.out.println(c + ":" + count);
        }

        // Q6: Frequency using visited array
        char[] arr = s.toCharArray();
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + ":" + count);
            }
        }

        // Q7: Palindrome check
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");

        // Q8: Anagram
        String s1 = sc.next();
        String s2 = sc.next();
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");

        // Q9: Calendar
        int month = sc.nextInt();
        int year = sc.nextInt();
        Calendar cal = new GregorianCalendar(year, month - 1, 1);
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < startDay; i++) System.out.print("    ");
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay - 1) % 7 == 0) System.out.println();
        }
        System.out.println();

        // Q10: Student grades
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        double perc = (phy + chem + math) / 3.0;
        String grade;
        if (perc >= 80) grade = "A";
        else if (perc >= 70) grade = "B";
        else if (perc >= 60) grade = "C";
        else if (perc >= 50) grade = "D";
        else if (perc >= 40) grade = "E";
        else grade = "R";
        System.out.println("Percentage=" + perc + " Grade=" + grade);
    }
}
