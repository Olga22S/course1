package ru.skypro.homework7;

public class Task6 {

    public static void main(String[] args) {

        System.out.print("Средняя сумма трат за месяц составила ");
        System.out.println(getAverageMonthExpenses(generateRandomArray()) + " рублей");
    }

    public static double getAverageMonthExpenses(int[] monthExpenses) {
        return getMonthExpenses(monthExpenses) / monthExpenses.length;
    }

    private static double getMonthExpenses(int[] monthExpenses) {
        int sum = 0;

        for (int i = 0; i < monthExpenses.length; i++) {
            sum += monthExpenses[i];
        }
        return sum;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
