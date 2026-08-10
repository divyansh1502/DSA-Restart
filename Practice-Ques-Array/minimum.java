public class minimum {
    public static void main(String[] args) {
        int[] arr = {12, 25, 36, 95, 45, 7, 87};
        System.out.println("Minimum: " + min(arr));
    }
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}


