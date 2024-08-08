import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        SortingContext context = new SortingContext();

        // Using Bubble Sort
        context.setStrategy(new BubbleSort());
        context.sortArray(array);
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(array));

        // Using Selection Sort
        context.setStrategy(new SelectionSort());
        context.sortArray(array);
        System.out.println("Sorted array using Selection Sort: " + Arrays.toString(array));

        // Using Insertion Sort
        context.setStrategy(new InsertionSort());
        context.sortArray(array);
        System.out.println("Sorted array using Insertion Sort: " + Arrays.toString(array));
    }
}
