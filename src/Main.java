import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");


        int[] inputArray1 = {100, 200, 300, 400, 500};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int maxSum = 0;
        int minSum = inputArray1[0];

        for (int sumM : inputArray1) {
            sum += sumM;
        }

        for (int max : inputArray1) {
            if (max > maxSum) {
                maxSum = max;
            }
        }

        for (int min : inputArray1) {
            if (min < minSum) {
                minSum = min;
            }
        }
        double averageSum = (float) sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = maxSum;
        outputArray1[2] = minSum;
        outputArray1[3] = (float) averageSum;
        System.out.println(Arrays.toString(outputArray1));


        System.out.println("Task 2");


        int[] inputArray2 = {100, 200, 300, 400, 500};
        float[] outputArray2 = new float[5];

        for (int iA = 0; iA < 5; iA++) {
            outputArray2[iA] = ((float) inputArray2[iA] / 100) * 13;
        }
        System.out.println(Arrays.toString(outputArray2));


        System.out.println("Task 3");

        int[] inputArray3 = {1000, 3000, 7000, 10000, 15000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        for (int bonus : inputArray3) {
            if (bonus > 5000) {
            } else {
            }
        }
        for (int oA = 0; oA < outputArray3.length; oA++) {
            outputArray3[oA] = inputArray3[oA] > 5000;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));


        System.out.println("Task 4");

        int[] inputArray4 = {100, -1, 300, 400, 500};
        boolean[] outputArray4 = new boolean[inputArray4.length];
        boolean hasNegative = false;

        for (int remain : inputArray4) {
            if (remain > 0) {
            } else if (remain < 0) {
                hasNegative = true;
                break;
            }
        }
        for (int oS = 0; oS < outputArray4.length; oS++) {
            outputArray4[oS] = inputArray4[oS] > 0;


        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println(!hasNegative);


        System.out.println("Task 5");

        int[] inputArray5 = {100, 200, 300, 400, 500};
        int[] outputArray5 = new int[inputArray5.length];
        int monthProfit = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                monthProfit++;
            }
        }
        System.out.println("Количество прибыльных месяцев " + monthProfit);
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));

        }
    }
