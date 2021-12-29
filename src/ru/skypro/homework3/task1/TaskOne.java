package ru.skypro.homework3.task1;

public class TaskOne {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        i--;
        System.out.print('\n');
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
