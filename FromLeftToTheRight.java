import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            int sum1 = 0;
            int sum2 = 0;
            String name = scanner.nextLine();
            for (int i = 0; i < name.length() - 1; i++) {
                if (name.charAt(i) == ' ') {
                    for (int j = 1; j < name.length() - i; j++) {
                        if (name.charAt(j + i) == '-') {

                        } else if (name.charAt(j + i) == '.') {

                        } else {
                            sum2 += name.charAt(j + i) - '0';
                        }
                    }
                    break;
                }
                if (name.charAt(i) == '-') {

                } else if (name.charAt(i) == '.') {

                } else {
                    sum1 += name.charAt(i) - '0';
                }
            }
            if (sum1 == sum2 && sum2 == 0) {

            } else if (sum1 > sum2) {
                System.out.println(sum1);
            } else if (sum2 >= sum1) {
                System.out.println(sum2);
            }
            n--;
        }
    }
}
