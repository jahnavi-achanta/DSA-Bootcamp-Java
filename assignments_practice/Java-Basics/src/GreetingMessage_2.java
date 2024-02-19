import java.util.Scanner;

public class GreetingMessage_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Hi "+name+" ,Welcome to the world of humans");
        sc.close();
    }
}
