import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int needle = 0;
        int numFound = 0;
        boolean wasNumFound = false;
        int min = 0;
        int max = 0;

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = generator.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        avg = sum / dataPoints.length;
        System.out.println("");
        System.out.println("The sum of the random array dataPoints is " + sum);
        System.out.println("The average of the random array dataPoints is " + avg);

        needle = SafeInput.getRangedInt(in, "Please enter an integer to search for [1-100]", 1, 100);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == needle)
            {
                numFound++;
            }
        }
        System.out.println("The number " + needle + " was found " + numFound + " time(s) in the random array dataPoints.");

        needle = SafeInput.getRangedInt(in, "Please enter an integer to search for [1-100]", 1, 100);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == needle)
            {
                System.out.println("The number " + needle + " was found at position " + i + ".");
                wasNumFound = true;

                break;
            }
        }

        if (!wasNumFound) {
            System.out.println("The number " + needle + " was not found.");
        }

        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the random array dataPoints is " + min + ".");
        System.out.println("The maximum value in the random array dataPoints is " + max + ".");

        System.out.println("The average of the random array dataPoints returned by method getAverage is " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int avg = 0;
        int sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        avg = sum / values.length;

        return avg;
    }
}