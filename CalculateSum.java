import java.util.Scanner;
public class CalculateSum {
    public static int Sum(int a, int b ) {
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your first num : ");
        int a = read.nextInt();
        System.out.print("Enter your second num : ");
        int b = read.nextInt();

        int sum = Sum(a,b);
        System.out.println("the sum is " + sum);

    }
}
