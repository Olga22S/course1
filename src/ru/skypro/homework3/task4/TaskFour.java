package ru.skypro.homework3.task4;

public class TaskFour {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ":");
            if (i % 3 == 0) {
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.print(" pong");
            }
            System.out.println();
        }
    }
}
