package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> items = new ArrayList<>();

        while (!"Bake It!".equals(input)) {
            input = input.replaceAll("#", " ");
            items.add(input);

            input = scanner.nextLine();
        }

        List<Integer> lengths = new ArrayList<>();
        List<Double> averages = new ArrayList<>();
        int TotalQualityMax = Integer.MIN_VALUE;
        double bestAverage = 0;
        String bestBatch = "";

        for (int i = 0; i < items.size(); i++) {
            boolean isFewest = false;
            String[] batchString = items.get(i).split(" ");
            int[] batch = new int[batchString.length];

            for (int j = 0; j < batchString.length; j++) {
                batch[j] = Integer.parseInt(batchString[j]);
            }

            int sum = 0;
            double average = 0;
            int length = batch.length;

            for (int j = 0; j < batch.length; j++) {
                sum += batch[j];
                average += batch[j];
            }
            average /= batch.length;

            lengths.add(length);
            averages.add(average);

            if (TotalQualityMax <= sum) {
                TotalQualityMax = sum;
                bestBatch = items.get(i);
                if(i==0){
                    bestAverage=average;
                }
                if(TotalQualityMax==sum){
                    if(bestAverage==average){

                    }else if(bestAverage<average){

                    }
                }

            }


        }
        System.out.printf("Best Batch quality: %d\n", TotalQualityMax);
        System.out.println(bestBatch);
    }
}
//1#2#2##-1#3
//3#2#2
//5#1#1#1#1
//Bake It!