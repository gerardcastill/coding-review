import static Algorithms.Sorting.MergeSort.mergeSort;
import static Algorithms.Sorting.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {15, 67, 23, 5, 8, 12, 87};

        System.out.println("Orignal array:");
        printArray(array);

        // mergeSort(array);
        // quickSort(array);

        System.out.println("\nSorted array:");
        printArray(array);

    }

    public static void printArray(int[]array){
        for (int value : array){
            System.out.print(value + " ");
        }
        System.out.println();

    }
}