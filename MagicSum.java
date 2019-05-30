import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strNumbers = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int subtraction = n - numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if(subtraction==numbers[j] && !(i==j) && j>i){
                    System.out.print(""+numbers[i]+" "+numbers[j]);
                    System.out.println();
                }
            }
        }
    }
}