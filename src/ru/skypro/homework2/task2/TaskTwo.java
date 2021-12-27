package ru.skypro.homework2.task2;

public class TaskTwo {

    public static void main(String[] args) {

        int clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.print("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.print("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.print("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.print("Установите версию приложения для Android по ссылке");
            }
        }
    }
}
