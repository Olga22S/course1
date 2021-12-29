package ru.skypro.homework2.task3;

public class TaskThree {

    public static void main(String[] args) {

        int year = 2021;

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.print(year + " год является високосным");
        } else {
            System.out.print(year + " год не является високосным");
        }
    }
}
