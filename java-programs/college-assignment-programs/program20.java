import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        System.out.println("Name : Parinidhi kataiha, enrollment no. : 0873CS231081" + "\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
