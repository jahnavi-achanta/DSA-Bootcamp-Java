import java.util.Scanner;

public class Operator_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String op = sc.next();
        if(op.equals("+")) {
            System.out.println("Sum = "+(num1+num2));
        }
        else if(op.equals("-")) {
            System.out.println("Subtraction = "+(num1-num2));
        }
        else if(op.equals("*")) {
            System.out.println("Multiplication = "+(num1*num2));
        }
        else if(op.equals("/")) {
            System.out.println("Division = "+(num1/num2));
        }
    }
}
