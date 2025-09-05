import java.util.*;

public class Level2Programs {
    public static void main(String[] args) {
        // Call any method here for testing
        // Example:
        // findStringLength();
        // splitTextCompare();
    }

    static void findStringLength() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        System.out.println("Length: " + count + " | Built-in: " + s.length());
    }

    static void splitTextCompare() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] builtIn = s.split(" ");
        int wc = 1;
        for (char c : s.toCharArray()) if (c == ' ') wc++;
        String[] custom = new String[wc];
        String word = "";
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (c != ' ') word += c;
            else { custom[idx++] = word; word = ""; }
        }
        custom[idx] = word;
        System.out.println(Arrays.toString(custom));
        System.out.println(Arrays.toString(builtIn));
        System.out.println(Arrays.equals(custom, builtIn));
    }

    static void splitWithLength() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(words[i].length());
        }
        for (String[] row : arr) System.out.println(row[0] + " - " + row[1]);
    }

    static void findShortestLongest() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String shortW = words[0], longW = words[0];
        for (String w : words) {
            if (w.length() < shortW.length()) shortW = w;
            if (w.length() > longW.length()) longW = w;
        }
        System.out.println("Shortest: " + shortW + " | Longest: " + longW);
    }

    static void countVowelsConsonants() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + " | Consonants: " + c);
    }

    static void charTypeDisplay() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) >= 0) System.out.println(ch + " - Vowel");
                else System.out.println(ch + " - Consonant");
            } else System.out.println(ch + " - Not a Letter");
        }
    }

    static void trimSpaces() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        String trimmed = s.substring(start, end + 1);
        System.out.println("Custom Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + s.trim() + "'");
    }

    static void votingEligibility() {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int age : ages)
            System.out.println(age + " -> " + (age >= 18 ? "Can Vote" : "Cannot Vote"));
    }

    static void rockPaperScissors() {
        Scanner sc = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        int userWins = 0, compWins = 0;
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Choose rock/paper/scissors: ");
            String user = sc.next();
            String comp = options[(int)(Math.random() * 3)];
            System.out.println("Computer: " + comp);
            if (user.equals(comp)) System.out.println("Draw");
            else if ((user.equals("rock") && comp.equals("scissors")) ||
                     (user.equals("paper") && comp.equals("rock")) ||
                     (user.equals("scissors") && comp.equals("paper"))) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                compWins++;
            }
        }
        System.out.println("User Wins: " + userWins + ", Computer Wins: " + compWins);
    }

    static void studentGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextInt();
            marks[i][1] = sc.nextInt();
            marks[i][2] = sc.nextInt();
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        System.out.println("Stu\tP\tC\tM\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+String.format("%.2f",percentages[i])+"\t"+grades[i]);
        }
    }
}
