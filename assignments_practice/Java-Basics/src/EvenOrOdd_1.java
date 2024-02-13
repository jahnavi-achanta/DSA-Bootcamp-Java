import java.util.Scanner;

public class EvenOrOdd_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        sc.close();
        if(number%2 == 0) {
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }
    }
}
