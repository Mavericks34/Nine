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
            if (sumM > maxSum) {
                maxSum = sumM;
            }
            if (sumM < minSum) {
                minSum = sumM;
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
        float[] outputArray2 = new float[inputArray2.length];

        int index = 0;
        for (int salaryS : inputArray2) {
            outputArray2[index] = ((float) salaryS / 100) * 13;
            index++;
        }
        System.out.println(Arrays.toString(outputArray2));
        System.out.println(Arrays.toString(inputArray2));


        System.out.println("Task 3");

        int[] inputArray3 = {1000, 3000, 7000, 10000, 15000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int indexX = 0;
        for (int bonus : inputArray3) {
            outputArray3[indexX] = bonus > 5000;
            indexX++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));


        System.out.println("Task 4");

        int[] inputArray4 = {100, -1, 300, 400, 500};
        boolean[] outputArray4 = {true};

        for (int remain : inputArray4) {
            if (remain < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));


        System.out.println("Task 5");

        int[] inputArray5 = {-1, 200, 300, 400, 500};
        int monthProfit = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                monthProfit++;
            }
        }
        int[] outputArray5 = {monthProfit};
        System.out.println("Количество прибыльных месяцев " + Arrays.toString(outputArray5));
        System.out.println(Arrays.toString(inputArray5));

    }
}
