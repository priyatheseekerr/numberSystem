package numberSystem;
// Convert Decimal to Binary
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a num:" );
        int num=sc.nextInt();

        StringBuilder binary=new StringBuilder();
        while(num>0){
            int rem=num%2;
            binary.append(rem);
            num/=2;
        }
        System.out.println(binary.reverse());
        sc.close();
    }
}
