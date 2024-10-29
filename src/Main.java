import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = generator.nextInt(100) + 1;
        }
        System.out.print(Arrays.toString(dataPoints));
    }
}