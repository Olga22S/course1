package ru.skypro.homework4;

public class TaskThree {

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

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[0]);
        for (int i = dArr.length - 1; i > 0; i--) {
            System.out.print(dArr[i] + ", ");
        }
        System.out.println(dArr[0]);
        for (int i = str.length - 1; i > 0; i--) {
            System.out.print(str[i] + ", ");
        }
        System.out.print(str[0]);
    }
}
