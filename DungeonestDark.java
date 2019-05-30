package Test;

import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] rooms = input.split("\\|");
        int health = 100;
        int coins = 0;
        int bestRoom = 0;
        boolean isDead = false;

        for (int i = 0; i < rooms.length; i++) {
            String[] arr = rooms[i].split("\\s+");
            if (arr[0].equals("potion")) {
                int healSize = Integer.parseInt(arr[1]);
                int healingDone = 0;
                int temphealth = health;
                if (health + healSize > 100) {
                    health = 100;
                    healingDone = health - temphealth;
                } else {
                    health += healSize;
                    healingDone = healSize;
                }
                System.out.printf("You healed for %d hp.\n", healingDone);
                System.out.printf("Current health: %d hp.\n", health);

            } else if (arr[0].equals("chest")) {
                int coinsFound = Integer.parseInt(arr[1]);
                coins += coinsFound;
                System.out.printf("You found %d coins.\n", coinsFound);
            } else {
                String monster = arr[0];
                int damage = Integer.parseInt(arr[1]);
                if(health>damage){
                    health-=damage;
                    System.out.printf("You slayed %s.\n",monster);
                }else{
                    System.out.printf("You died! Killed by %s.\n",monster);
                    bestRoom=i+1;
                    isDead=true;
                    break;
                }
            }
        }
        if(isDead){
            System.out.printf("Best room: %d\n",bestRoom);
        }else{
            System.out.printf("You've made it!\n");
            System.out.printf("Coins: %d\n",coins);
            System.out.printf("Health: %d\n",health);
        }
    }
}
