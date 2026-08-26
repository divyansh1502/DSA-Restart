public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        //same for LC 162 hard problem
        return start;
    }
}