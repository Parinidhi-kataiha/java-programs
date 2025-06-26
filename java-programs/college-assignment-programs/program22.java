import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        System.out.println("Name : Parinidhi kataiha, enrollment no. : 0873CS231081" + "\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Sum of series 1²+2²+3²+...+" + n + "² = " + sum);
    }
}
