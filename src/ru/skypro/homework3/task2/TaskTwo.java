package ru.skypro.homework3.task2;

public class TaskTwo {

    public static void main(String[] args) {

        int firstFriday = 6;
        int counter = 7;

        for (; firstFriday <= 31; firstFriday++, counter++) {
            if (counter == 7) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
                counter = 0;
            }
        }
    }
}
