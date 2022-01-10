package ru.skypro.homework4;

public class TaskNine {

    public static void main(String[] args) {

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == -2) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
