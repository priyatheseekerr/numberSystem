package numberSystem;
//	Convert Binary to Decimal

import java.util.Scanner;

public class BinaryToDecimal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        StringBuilder binary = new StringBuilder(sc.nextLine());
        binary.reverse();
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            int n = binary.charAt(i) - '0';
            sum += (n * Math.pow(2, i));
        }
        System.out.println(sum);
        sc.close();
    }
}
