package ru.skypro.homework7;

public class Main {

    public static void main(String[] args) {

        isLeapYear(2021);
        printApplicationLink(1, 2014);
        checkDuplicateCharacters("acbdefgghijk");
    }

    public static void isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printApplicationLink(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int getDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
        }
        return deliveryDays;
    }

    public static void checkDuplicateCharacters(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The symbol " + arr[i] + " is duplicated!");
                    return;
                }
            }
        }
        System.out.println("String is not contained any duplicates.");
    }

    public static void reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int temp = 0;
        while (i != j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
