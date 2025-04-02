package numberSystem;

//Convert Decimal to Octal
import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num: ");
        int num = sc.nextInt();

        StringBuilder octal = new StringBuilder();
        while (num > 0) {
            int rem = num % 8;
            octal.append(rem);
            num /= 8;
        }
        System.out.println(octal.reverse());
        sc.close();
    }
}
