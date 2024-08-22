import java.util.Scanner;

public class Main {

    public static int reverse(int num) {
        int reverse = 0;

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