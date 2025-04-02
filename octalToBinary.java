package numberSystem;

import java.util.Scanner;

public class octalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num: ");
        String octal=sc.nextLine();
        int num = Integer.parseInt(octal,8);
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
        sc.close();
    }
}
