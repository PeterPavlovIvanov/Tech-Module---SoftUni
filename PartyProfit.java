package Test;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int coins = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 10 == 0) {
                partySize -= 2;
            }
            if (i % 15 == 0) {
                partySize += 5;
            }
            coins += (50 - 2 * partySize);
            if (i % 3 == 0) {
                coins -= (3 * partySize);
            }
            if (i % 5 == 0) {
                if(i%3==0){
                    coins+=(18*partySize);
                }else{
                    coins+=(20*partySize);
                }
            }

        }
        int eachMoney = coins / partySize;
        System.out.printf("%d companions received %d coins each.", partySize, eachMoney);
    }
}
