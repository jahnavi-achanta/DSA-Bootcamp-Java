import java.util.Scanner;

public class SimpleInterest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p,t,r");
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int sp = (p*t*r)/100;
        System.out.println("Simple Interest = "+sp);
        sc.close();
    }
}
