package numberSystem;
//	Convert digits/numbers to words
import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        String nums = String.valueOf(num);
        int n = nums.length();

        
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
                         "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", 
                         "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", 
                         "seventy", "eighty", "ninety"};

        StringBuilder word = new StringBuilder();
        int position = 0;
        boolean flag = false;

        while (num > 0) {

            int rev = num % 10;
            num /= 10;
            position++;
            if (position == 3) {
                if (rev > 0) {
                    if (flag) {
                        word.insert(0, " And ");
                    }
                    word.insert(0, ones[rev] + " Hundred ");
                }

            } else if (position == 2) {
                if (rev == 1) {
                    int lasttwo = Integer.parseInt(nums.substring(n - 2));
                    word = new StringBuilder(ones[lasttwo]);
                    flag = true;
                    break;
                } else {
                    word.insert(0, tens[rev] + " ");
                    flag = true;
                }
            } else {
                word.insert(0, ones[rev] + " ");
            }
        }
        System.out.println(word.toString().trim());
        sc.close();
    }
}
