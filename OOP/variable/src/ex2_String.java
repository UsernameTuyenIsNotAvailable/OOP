import java.util.Scanner;

public class ex2_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" my_string = ");
        String my_string = scanner.nextLine();
        System.out.print(alternateCase(my_string));

    }
   private static String alternateCase(String my_string ) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length() ; i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(my_string.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(my_string.charAt(i)));
            }
        }
        return sb.toString();

}
}
