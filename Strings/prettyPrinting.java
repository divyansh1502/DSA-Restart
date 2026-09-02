public class prettyPrinting {
    public static void main(String[] args) {
        float a = 25.63545264352f;
        System.out.printf("Formatted number is: %.2f", a);
        System.out.println();
        System.out.printf("PI: %.5f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am from %s", "Divyansh", "Lucknow");

 /*
        | Specifier | Used for                                 | Example            |
| --------- | ---------------------------------------- | ------------------ |
| `%d`      | Integer (`byte`, `short`, `int`, `long`) | `%d` → `22`        |
| `%f`      | Floating-point (`float`, `double`)       | `%f` → `22.500000` |
| `%s`      | String                                   | `%s` → `Divyansh`  |
| `%c`      | Character                                | `%c` → `A`         |
| `%b`      | Boolean                                  | `%b` → `true`      |
| `%x`      | Integer in hexadecimal                   | `%x` → `ff`        |
| `%o`      | Integer in octal                         | `%o` → `77`        |
| `%e`      | Scientific notation                      | `%e` → `2.25e+01`  |
| `%n`      | New line                                 | `%n`               |
| `%%`      | Prints `%` itself                        | `%%` → `%`         |

*/
    }
}