import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String str = "Divyansh Singh I am a B.Tech Student";
        System.out.println(Arrays.toString(str.toCharArray()));

        String s = "         abhay singh"; 
        System.out.println(s.toUpperCase().trim());
        System.out.println(s.toLowerCase().trim());
        System.out.println(s.charAt(9));
        System.out.println(s.indexOf('s'));
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
