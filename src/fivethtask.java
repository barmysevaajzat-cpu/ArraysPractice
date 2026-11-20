import java.util.Arrays;
import java.util.Scanner;

public class fivethtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        for (int i = 0; i < score.length; i++) {
            int a;
            do {
                System.out.println("Enter score 0-100: " + (i + 1));
                a = sc.nextInt();
                if (a < 0 || a > 100) {
                    System.out.println("Invalid score, try one more time");
                }
            } while (a < 0 || a > 100);
            score[i] = a;
        }
                int passed = 0;
                int failed = 0;
                int sum = 0;
                for ( int i = 0; i <score.length;i++){
                    if (score[i] >= 60) {
                        passed++;
                    } else {
                        failed++;
                    }
                    sum += score[i];
                }
                double average = (double) sum / score.length;
                System.out.println("Scores:  " + Arrays.toString(score));
                System.out.println("Passed: " + passed);
                System.out.println("failed: " + failed);
                System.out.println("average: " + average);
            }
        }
