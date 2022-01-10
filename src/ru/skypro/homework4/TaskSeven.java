package ru.skypro.homework4;

import java.util.Arrays;

public class TaskSeven {

    public static void main(String[] args) {

        int temp;
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
