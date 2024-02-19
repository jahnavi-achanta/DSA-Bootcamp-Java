import java.util.Scanner;

public class CurrencyConversion_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the currency in rupees : ");
        int rupees = sc.nextInt();
        //Reason for dividing with 83.0 is to get the result in decimal points
        System.out.println("Currency in dollars for rupees "+ rupees + " = "+ String.format("%.2f",(rupees/83.0)));
        sc.close();
    }
}
