package ru.skypro.homework2.task7;

public class TaskSeven {

    public static void main(String[] args) {

        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        printCreditDecision(age, salary, wantedSum);
    }

    public static void printCreditDecision(int age, int salary, int wantedSum) {
        double maxMonthlyPayment = (double) salary * 0.5;
        double interestRate = 10;
        int creditPeriod = 12;
        double monthlyPayment;

        if (age < 23) {
            interestRate += 1;
        } else if (age < 30) {
            interestRate += 0.5;
        }
        if (salary > 80_000) {
            interestRate -= 0.7;
        }
        monthlyPayment = (wantedSum + (wantedSum * (interestRate / 100))) / creditPeriod;
        System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. ");
        System.out.print("Платеж по кредиту " + monthlyPayment + " рублей. ");
        if (monthlyPayment > maxMonthlyPayment) {
            System.out.println("Отказано.");
        } else {
            System.out.println("Одобрено.");
        }
    }
}
