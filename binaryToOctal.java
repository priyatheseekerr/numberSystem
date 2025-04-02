package numberSystem;
//Convert binary to octal
import java.util.Scanner;

public class binaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        String binary = sc.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        sc.close();
    }
}
