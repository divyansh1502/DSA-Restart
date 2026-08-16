public class LC1672 {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 1},
            {10, 2, 6}
        };
        System.out.println(maximumWealth(nums));
    }
    static int maximumWealth(int[][] accounts) {
        int total = 0;
        for (int person = 0; person < accounts.length; person++) {
            int max = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                max += accounts[person][account];
            }
            if(max > total) {
                total = max;
            }
        }
        return total;
    }
}
