package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputF = scanner.nextLine();
        List<String> quests = Arrays
                .stream(inputF.split(", "))
                .collect(Collectors.toList());

        String commands = "";
        while (!"Retire!".equals(commands)) {
            String[] input = commands.split(" - ");
            String command = input[0];
            if ("Start".equals(command)) {
                if (!quests.contains(input[1])) {
                    quests.add(input[1]);
                }
            } else if ("Complete".equals(command)) {
                if (quests.contains(input[1])) {
                    quests.remove(input[1]);
                }
            } else if ("Side Quest".equals(command)) {
                String[] arr = input[1].split(":");
                if (quests.contains(arr[0]) && !(quests.contains(arr[1]))) {
                    int index = quests.indexOf(arr[0]);
                    if (index == quests.size() - 1) {
                        quests.add(arr[1]);
                    } else {
                        quests.add(index + 1, arr[1]);
                    }
                }
            } else if ("Renew".equals(command)) {
                if (quests.contains(input[1])) {
                    quests.remove(input[1]);
                    quests.add(input[1]);
                }
            }


            commands = scanner.nextLine();
        }
        for (int i = 0; i < quests.size(); i++) {
            System.out.print(quests.get(i));
            if (i != quests.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
