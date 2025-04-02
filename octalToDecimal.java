package numberSystem;
// Convert Octal To Decimal
import java.util.Scanner;

public class octalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num: ");
        String octal = sc.nextLine();
        int num = Integer.parseInt(octal, 8);
        System.out.println(num);
        sc.close();
    }
}
