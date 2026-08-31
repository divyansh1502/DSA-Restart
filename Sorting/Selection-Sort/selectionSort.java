import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {

        // for (int i = 0; i < arr.length - 1; i++) {
        //     int max = i;
        //     for (int j = 0; j < arr.length - i; j++) {
        //         if(arr[max] < arr[j]) {
        //             max = j;
        //         }
        //         swap(arr, max, arr.length - 1 - i);
        //     }
        // }

        //Method 2
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - 1 - i;
            int max = findMaxIndex(arr, last);
            swap(arr, max, last);
        }
    }
    static int findMaxIndex(int[] arr, int last) {
        int max = 0;
        for (int i = 0; i < last; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
