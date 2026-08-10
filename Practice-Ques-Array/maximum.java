public class maximum {
    public static void main(String[] args) {
        int[] arr = {12, 25, 36, 95, 45, 27, 87};
        System.out.println("Maximum: " + max(arr));
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
