import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumber = scanner.nextLine();

        System.out.println("The integer equivalent is: " + romanToInt(romanNumber));

        scanner.close();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanToInt.get(s.charAt(i)) < romanToInt.get(s.charAt(i + 1))) {
                result -= romanToInt.get(s.charAt(i));
            } else {
                result += romanToInt.get(s.charAt(i));
            }
        }
        return result + romanToInt.get(s.charAt(s.length() - 1));
    }
}
