
    public class floorNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 14, 18, 26, 34};
        int target = 19;
        System.out.println(ceiling(arr, target));
    }   
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        if(target < arr[start]) return -1;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    } 
}


