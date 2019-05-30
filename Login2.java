import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input username on the first line.
        //Put a password in the next few lines.
        //Correct Password is the username reversed (case sensitive)

        String username = scanner.nextLine();

        String reversedUserName = "";

        for (int i = 0; i < username.length(); i++) {
            reversedUserName += username.charAt(username.length() - i - 1);
        }

        int count = 1;

        String inputData = scanner.nextLine();
        while (!inputData.equals(reversedUserName)) {

            if (count++ == 4) {
                System.out.printf("User %s blocked!%n", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");

            inputData = scanner.nextLine();
        }
        System.out.printf("User %s logged in.%n",username);
    }
}
