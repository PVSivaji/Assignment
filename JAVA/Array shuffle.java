import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(arr);

        Collections.shuffle(list);

        // Convert the list back to an array
        Integer[] shuffledArr = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArr));
    }
}

