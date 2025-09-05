import java.util.*;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: Compare two strings
        String s1 = sc.next();
        String s2 = sc.next();
        boolean equal = s1.length() == s2.length();
        if (equal) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println(equal);
        System.out.println(s1.equals(s2));

        // Q2: Substring
        String s = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String custom = "";
        for (int i = start; i < end; i++) custom += s.charAt(i);
        String builtIn = s.substring(start, end);
        System.out.println(custom);
        System.out.println(builtIn);
        System.out.println(custom.equals(builtIn));

        // Q3: Convert to char array
        String str = sc.next();
        char[] customArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) customArr[i] = str.charAt(i);
        char[] builtInArr = str.toCharArray();
        System.out.println(Arrays.equals(customArr, builtInArr));

        // Q4: NullPointerException
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }

        // Q5: StringIndexOutOfBounds
        String sIndex = sc.next();
        try {
            System.out.println(sIndex.charAt(sIndex.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }

        // Q6: IllegalArgumentException
        String sIllegal = sc.next();
        try {
            System.out.println(sIllegal.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        }

        // Q7: NumberFormatException
        String sNum = sc.next();
        try {
            int num = Integer.parseInt(sNum);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }

        // Q8: ArrayIndexOutOfBoundsException
        String[] arr = {"a", "b", "c"};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }

        // Q9: To Upper Case
        String up = sc.next();
        String upperCustom = "";
        for (int i = 0; i < up.length(); i++) {
            char c = up.charAt(i);
            if (c >= 'a' && c <= 'z') upperCustom += (char) (c - 32);
            else upperCustom += c;
        }
        System.out.println(upperCustom);
        System.out.println(up.toUpperCase());

        // Q10: To Lower Case
        String low = sc.next();
        String lowerCustom = "";
        for (int i = 0; i < low.length(); i++) {
            char c = low.charAt(i);
            if (c >= 'A' && c <= 'Z') lowerCustom += (char) (c + 32);
            else lowerCustom += c;
        }
        System.out.println(lowerCustom);
        System.out.println(low.toLowerCase());
    }
}
