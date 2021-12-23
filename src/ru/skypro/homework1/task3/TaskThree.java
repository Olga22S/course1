package ru.skypro.homework1.task3;

public class TaskThree {

    public static void main(String[] args) {

        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int commonGrams = bananas + milk + iceCream + eggs;
        double commonKG = (double) commonGrams / 1000;

        System.out.println("Breakfast weight: " + commonKG + " kg");
    }
}
