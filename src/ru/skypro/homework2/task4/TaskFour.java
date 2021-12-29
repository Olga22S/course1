package ru.skypro.homework2.task4;

public class TaskFour {

    public static void main(String[] args) {

        int deliveryDistance = 95;
        int daysNum = 1;

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysNum++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysNum += 2;
        }
        System.out.print("Потребуется дней: " + daysNum);
    }
}
