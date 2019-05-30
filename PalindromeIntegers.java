import java.util.Scanner;

public class PalindromeIntegers {
    private static boolean isPalindrome;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!(input.equals("END"))) {
            CheckIfPalindrome(input);
            input = scanner.nextLine();
        }
    }

    private static void CheckIfPalindrome(String input) {
        isPalindrome = true;
        if (input.length() % 2 == 0) {
            int counter = 0;
            for (int i = input.length() - 1; i >= (input.length() / 2); i--) {
                if (input.charAt(counter) == input.charAt(i)) {

                } else {
                    isPalindrome = false;
                    break;
                }
                counter++;
            }
        } else {
            int counter = 0;
            for (int i = input.length() - 1; i >= (input.length() / 2)+1; i--) {
                if (input.charAt(counter) == input.charAt(i)) {

                } else {
                    isPalindrome = false;
                    break;
                }
                counter++;
            }
        }
        System.out.println(isPalindrome);
    }

}
