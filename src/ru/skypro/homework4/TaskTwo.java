package ru.skypro.homework4;

public class TaskTwo {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] dArr = {1.57, 7.654, 9.986};
        char[] str = new char[4];
        str[0] = 'j';
        str[1] = 'a';
        str[2] = 'v';
        str[3] = 'a';

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
        for (int i = 0; i < dArr.length - 1; i++) {
            System.out.print(dArr[i] + ", ");
        }
        System.out.println(dArr[dArr.length - 1]);
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + ", ");
        }
        System.out.print(str[str.length - 1]);
    }
}
