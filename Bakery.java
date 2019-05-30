package Test;

import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] events = scanner.nextLine().split("\\|");
        int energy = 100;
        int coins = 100;
        boolean isBankrupt = false;

        for (int i = 0; i < events.length; i++) {
            String[] command = events[i].split("-");
            if("rest".equals(command[0])){
                String temp = command[1].replaceAll(" ","");
                int restoreEnergy=Integer.parseInt(temp);
                if(energy+restoreEnergy>100){
                    System.out.printf("You gained %d energy.",100-energy);
                    System.out.println();
                    energy=100;
                }else{
                    energy+=restoreEnergy;
                    System.out.printf("You gained %d energy.",restoreEnergy);
                    System.out.println();
                }
                System.out.printf("Current energy: %d.",energy);
                System.out.println();
            }else if("order".equals(command[0])){
                int coinsCollect = Integer.parseInt(command[1]);
                if(energy>=30){
                    energy-=30;
                    coins+=coinsCollect;
                    System.out.printf("You earned %d coins.",coinsCollect);
                    System.out.println();
                }else{
                    energy+=50;
                    System.out.print("You had to rest!");
                    System.out.println();
                }
            }else {
                int coinsToSpend= Integer.parseInt(command[1]);
                if(coins>coinsToSpend){
                    coins-=coinsToSpend;
                    System.out.printf("You bought %s.",command[0]);
                    System.out.println();
                }else{
                    isBankrupt=true;
                    System.out.printf("Closed! Cannot afford %s.",command[0]);
                    System.out.println();
                    break;
                }
            }
        }

        if(!isBankrupt){
            System.out.print("Day completed!");
            System.out.println();
            System.out.printf("Coins: %d",coins);
            System.out.println();
            System.out.printf("Energy: %d",energy);
            System.out.println();
        }
    }
}
