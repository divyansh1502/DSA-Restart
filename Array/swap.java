import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {71, 26, 93, 84, 55, 64};

        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
