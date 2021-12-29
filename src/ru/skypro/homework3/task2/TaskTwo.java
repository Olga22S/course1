package ru.skypro.homework3.task2;

public class TaskTwo {

    public static void main(String[] args) {

        int firstFriday = 3;

        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }
}
