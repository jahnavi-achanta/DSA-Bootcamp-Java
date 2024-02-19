import java.util.Scanner;

public class Fibonacci_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Fibonacci : ");
        int fibRange = sc.nextInt();
        int fib0=0, fib1 = 1, fib2;
        System.out.print(fib0 + " ");
        System.out.print(fib1 + " ");
        for(int i=2;i<fibRange;i++) {
            fib2 = fib0 + fib1;
            System.out.print(fib2 + " ");
            fib0 = fib1;
            fib1 = fib2;
        }
        sc.close();
    }
}
