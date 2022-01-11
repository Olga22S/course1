package ru.skypro.homework5;

public class TaskTwo {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
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
