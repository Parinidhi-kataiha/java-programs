import java.util.Scanner;

public class program25 {
    public static void main(String[] args) {
        System.out.println("Name : Parinidhi kataiha, enrollment no. : 0873CS231081" + "\n");

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
