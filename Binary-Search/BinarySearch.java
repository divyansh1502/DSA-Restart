public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-37, -25, -13, -3, 0, 1, 3, 4, 9, 15, 19, 23, 28, 34, 42, 56};
        int target = 28;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
