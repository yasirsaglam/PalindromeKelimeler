import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String kelime = input.next();
        boolean isPalindrome = true;
        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Girdiğiniz kelime Palindrome kelimedir.");
        } else {
            System.out.println("Girdiğiniz kelime Palindrome kelime değildir.");
        }
    }
}
