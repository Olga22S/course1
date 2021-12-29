package ru.skypro.homework3.task3;

public class TaskThree {

    public static void main(String[] args) {

        int year = 0;

        while (year < 1821) {
            year += 79;
        }
        while (year <= 2121) {
            System.out.println(year);
            year += 79;
        }
    }
}
