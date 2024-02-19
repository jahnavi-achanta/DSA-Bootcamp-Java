import java.util.Scanner;

public class Palindrome_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        //If is use next() for taking input only characters till space are considered.
        //Eg: str = sc.next(), input : abc abc str contains only abc
        String str = sc.nextLine();
        boolean result = isPalindrome(str);
        if(result) {
            System.out.println(str + " is palindrome");
        }
        else {
            System.out.println(str + " is not palindrome");
        }
        sc.close();
    }

    static boolean isPalindrome(String str) {
        int j = str.length()-1;
        for(int i=0;i<str.length()/2;i++) {
            if(str.charAt(i) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
