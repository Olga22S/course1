package ru.skypro.homework5;

public class TaskThree {

    public static void main(String[] args) {

        int sum = 0;
        double average = 0;
        int[] arr = generateRandomArray();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = (double) sum / (double) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
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
