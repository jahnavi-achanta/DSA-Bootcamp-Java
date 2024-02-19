import java.util.Scanner;

public class Largestof2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int result = (a>b) ? a : b;
        System.out.println(result + " is the greatest number.");
    }
}
