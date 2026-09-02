public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = ((char)('a' + i));
            // System.out.println(ch);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.reverse());
        System.out.println(builder.delete(5,10));
        System.out.println(builder.charAt(5));
        
    }
}
