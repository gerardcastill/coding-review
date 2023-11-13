package Algorithms.Sorting;

public class QuickSort {


    public static void quickSort(int[]array){
        if (array == null || array.length == 0){
            return; // Nothing to sort
        }

        int length = array.length;
        quickSortRecursive(array, 0, length-1);
    }

    public static void quickSortRecursive(int[]array, int low, int high){
        if (low < high){
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the subarrays
            quickSortRecursive(array, low, pivotIndex -1);
            quickSortRecursive(array, pivotIndex+1, high);
        }
    }

    public static int partition(int[]array, int low, int high){
        // Choose the pivot (choosing the last pivot in this algo but can be randomized)
        int pivot = array[high];

        // Index of the smaller element
        int i = low -1;

        // Traverse the array and rearrange elements based on the pivot
        for(int j = low; j< high; j++){
            if(array[j] <= pivot){
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] (pivot) and array[high]
        int temp = array[i +1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index of the pivot element
        return i+1;
    }
}
