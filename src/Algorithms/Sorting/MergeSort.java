package Algorithms.Sorting;

public class MergeSort {
    /* Merge sort is a divide-and-conquer sorting algorithm.
    This algorithm has a time complexity of O(n log n) and a space complexity of O(n)
    It is suitable for sorting linked lists as well as arrays.
    It is also a stable sorting algorithm which maintains the relative order of equal elements in the sorted output

    Divide:
        The input array is divided into two halves, recursively, until each sub-array contains one element.
        This is achieved by finding the middle index of the array.
    Conquer:
        The sub-arrays are recursively sorted.
        The base case is when a sub-array contains only one element, as a single element is considered sorted by definition.
    Merge:
        The sorted sub-arrays are merged to produce a single sorted array.

    While merging, elements from the two sub-arrays are compared, and the smaller element is placed in the final sorted array.
    This process continues until all elements are merged into a single sorted array.
     */
    public static void mergeSort(int[]array){
        int length = array.length;
        int middle = length/2;

        if (length < 2){
            return; // Already sorted if the array has 0 or 1 element **Base Case**
        }

        // Create two subarrays
        int[]leftArray = new int[middle];
        int[]rightArray = new int[length-middle];

        // Copy data to subarrays
        System.arraycopy(array, 0, leftArray, 0, middle);
        System.arraycopy(array, middle, rightArray, 0, length-middle);

        // Recursively split the subarrays until base case is reached
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted subarrays
        mergeArrays(array, leftArray, rightArray);
    }

    // This method will be called to merge the subarrays and begin filling the original array with sorted elements
    public static void mergeArrays(int[]array, int[]left , int []right){
        int leftLength = left.length;
        int rightLength = right.length;

        // Initial index of two subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k=0;

        // Compare elements in left[] and right [] while indexes are less than array length
        while (i < leftLength && j < rightLength){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any, when all elements in right[] have been copied
        while (i < leftLength){
            array[k] = left[i];
            i++;
            k++;
        }
        // Copy remaining elements of right[] if any, when all elements in left[] have been copied
        while(j < rightLength){
            array[k] = right[j];
            j++;
            k++;
        }

    }
}
