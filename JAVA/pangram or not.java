import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        if (isPangram(input.toLowerCase())) {
            System.out.println("The input is a pangram!");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean isPangram(String input) {
        // Using a set to store unique characters
        Set<Character> charSet = new HashSet<>();

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            // Check if the character is a letter and not already in the set
            if (Character.isLetter(ch)) {
                charSet.add(ch);
            }
        }

        // Check if the set size is 26 (number of letters in the alphabet)
        return charSet.size() == 26;
    }
}

