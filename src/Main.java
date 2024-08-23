import java.util.Scanner;

public class Main {

    // Method to take an integer and return its reverse
    public static int reverse(int num) {
        int reverse = 0;

        /*

        Se it as two boxes, initially the number is stored in 'userInput',
        we move the number over to the 'reversed' box, number by number, starting from the last digit.gi

        #1 Loop until the number becomes 0
        #2 Extract the last digit of the number and add it to the 'reversed' number
        #3 Remove the last digit from the number

         */

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Put some numbers");

        Scanner userInput = new Scanner(System.in);

        int userNumber = userInput.nextInt();

        System.out.println(reverse(userNumber));
    }
}