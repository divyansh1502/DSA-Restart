public class LC28 {
    public static void main(String[] args) {
        String haystack = "navleetcode";
        String needle = "leet";

        System.out.println(strStr(haystack,needle));
    }
    static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {

            boolean found = true;

            for (int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found) {
                return i;
            }
        }
        return -1;
    }
}
