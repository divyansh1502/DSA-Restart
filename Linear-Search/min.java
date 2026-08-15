

public class min {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 56, 45, 73, 69};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;

    }
}
