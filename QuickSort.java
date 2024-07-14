import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,70,30,50};
        System.out.println("Original array: " + Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int leftMost, int RightMost){
        int pivot = arr[RightMost];
        int i = leftMost - 1;

        for (int j = leftMost; j < RightMost; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, RightMost);
        return i + 1;
    }

    static void quicksort(int[] arr, int leftMost, int RightMost){
        if(leftMost < RightMost){
            int pi = partition(arr, leftMost, RightMost);
            quicksort(arr, leftMost, pi - 1);
            quicksort(arr, pi + 1, RightMost);
        }
    }
}