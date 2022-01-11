package ru.skypro.homework4;

import java.util.Arrays;

public class TaskSix {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int[] reversedArr = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversedArr));
    }
}
