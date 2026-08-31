import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
}
static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}