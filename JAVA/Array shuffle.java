import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store user input values
        Integer[] array = new Integer[size];

        // Get values from the user
        System.out.println("Enter the values for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Convert the array to a list for shuffling
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        // Shuffle the list
        Collections.shuffle(arrayList);

        // Convert the shuffled list back to an array
        Integer[] shuffledArray = arrayList.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
