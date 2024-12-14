package OrientationTask3_2;
import java.util.Random;


public class AgeDistribution {
    public static void main(String[] args) {
        final int MAX_GENERATIONS = 1000;
        int[][] ageDistribution = {
                {16, 20},
                {34, 21},
                {52, 22},
                {68, 23},
                {82, 24},
                {89, 25},
                {94, 26},
                {96, 28},
                {98, 30},
                {100, 35}
        };

        int[] generatedAges = new int[36];
        Random random = new Random();

        for (int i = 0; i < MAX_GENERATIONS; i++) {
            int randomNumber = random.nextInt(100) + 1;
            for (int[] row : ageDistribution) {
                if (randomNumber <= row[0]) {
                    generatedAges[row[1]]++;
                    break;
                }
            }
        }

        System.out.println("Age  Count  %-Share");
        for (int age = 0; age < generatedAges.length; age++) {
            if (generatedAges[age] > 0) {
                System.out.printf("%-5d %-6d %.2f%%%n", age, generatedAges[age], (generatedAges[age] / (double) MAX_GENERATIONS) * 100);
            }
        }
    }
}
