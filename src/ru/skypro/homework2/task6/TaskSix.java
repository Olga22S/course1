package ru.skypro.homework2.task6;

public class TaskSix {

    public static void main(String[] args) {

        int age = 19;
        int salary = 58_000;
        printAllowedCredit(age, salary);
    }

    public static void printAllowedCredit(int age, int salary) {
        int allowedCredit;
        if (age >= 23) {
            allowedCredit = salary * 3;
        } else {
            allowedCredit = salary * 2;
        }
        if (salary >= 80_000) {
            allowedCredit *= 1.5;
        } else if (salary >= 50_000) {
            allowedCredit *= 1.2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + allowedCredit + " рублей");
    }
}
